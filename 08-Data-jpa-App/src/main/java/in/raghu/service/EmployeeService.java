package in.raghu.service;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.springframework.stereotype.Service;

import in.raghu.entity.Employee;
import in.raghu.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	public EmployeeRepository employeeRepo;

	public EmployeeService(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	
	public void getEmployeeData() {
		List<Employee> empList = employeeRepo.findAll();
		empList.forEach(System.out::println);
	}
	
	//Method to export database table data to excel
	// String filePath = "C:\\documents\\data.xlsx";
	public void exportDataToExcel(String filePath) throws IOException {
		List<Employee> empList = employeeRepo.findAll();
		
		try (XSSFWorkbook xssfWorkbook = new XSSFWorkbook()) {
			XSSFSheet sheet = xssfWorkbook.createSheet("Data");
			XSSFRow row = sheet.createRow(0);
			
			row.createCell(0).setCellValue("EmpId");
			row.createCell(1).setCellValue("EmpName");
			row.createCell(2).setCellValue("EmpSalary");
			row.createCell(3).setCellValue("EmpGender");
			row.createCell(4).setCellValue("EmpDept");
			
			int dataRowIndex=1;
			for(Employee emp: empList) {
				XSSFRow dataRow = sheet.createRow(dataRowIndex);
				dataRow.createCell(0).setCellValue(emp.getEmpId());
				dataRow.createCell(1).setCellValue(emp.getEmpName());
				dataRow.createCell(2).setCellValue(emp.getEmpSalary());
				dataRow.createCell(3).setCellValue(emp.getGender());
				dataRow.createCell(4).setCellValue(emp.getDepartment());
				dataRowIndex++;
			}
			
			try(FileOutputStream outputStream = new FileOutputStream(filePath)) {
				xssfWorkbook.write(outputStream);
			}
		}
	}
	
	public void getAllEmployeesData() {
		List<Employee> employees = employeeRepo.getAllEmployees();
		employees.forEach(System.out::println);
	}

}
