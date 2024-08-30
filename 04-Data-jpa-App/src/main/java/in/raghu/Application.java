package in.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		
		EmployeeService service=context.getBean(EmployeeService.class);
		
		//service.saveEmployee();
		//service.saveMultipleEmployees();
		//service.getEmpId(101);
		//service.getMultipleEmpIds();
		//service.getAllEmployees();
		//service.countOfRecords();
		//service.getEmployeesByDepartment("Engineer");
		//service.getEmployeesByDepartmentAndGender("Engineer", "Male");
		//service.getEmployeesBySalaryGraterThanEquals(40000.00);
		//service.getAllEmployeeRecords();
		//service.getEmpById(102);
		//service.deleteEmp(102);
		//service.getEmpNamesWithSalary();
		//service.fetchEmpNamesWuthSalary();
		//service.updateSalaryOfEmp(101);
		//service.UpdateSalaryOfEmployee(102, 50000.00);
		//service.getDataUsingNativeQuery();
		//service.getDataUsingNativeQueryOfCopy();
		//service.insertingDataOfexistingTablesCopy();
		//service.deleteEmpTemp(101);
		service.insertingTableDatatoAnother();
	}

}
