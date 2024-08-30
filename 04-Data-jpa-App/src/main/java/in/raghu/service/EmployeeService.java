package in.raghu.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.raghu.entity.Employee;
import in.raghu.entity.EmployeeDetails;
import in.raghu.entity.EmployeeTemp;
import in.raghu.repo.EmployeeRepo;
import in.raghu.repo.EmployeeTempRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	
	private EmployeeTempRepo empTemp;
	
	private List<EmployeeDetails> empNamesWithSalary;

	public EmployeeService(EmployeeRepo empRepo, EmployeeTempRepo empTemp) {
		this.empRepo = empRepo;
		System.out.println(this.empRepo.getClass().getName());
		this.empTemp = empTemp;
		System.out.println(this.empRepo.getClass().getName());
	}

	
	public void saveEmployee() {
		Employee emp=new Employee(101, "Raghu Ram", 30000.00, "male", "System engineer");
		empRepo.save(emp);
	}
	
	public void saveMultipleEmployees() {
		Employee emp1=new Employee();
		emp1.setEmpId(102);
		emp1.setEmpName("Siva");
		emp1.setEmpSalary(30000.00);
		emp1.setGender("Male");
		emp1.setDepartment("Engineer");
		
		Employee emp2=new Employee();
		emp2.setEmpId(103);
		emp2.setEmpName("Yeswanth");
		emp2.setEmpSalary(60000.00);
		emp2.setGender("Male");
		emp2.setDepartment("Engineer");
		
		List<Employee> empList = Arrays.asList(emp1,emp2);
			
		empRepo.saveAll(empList);
		
	}
	
	public void getEmpId(Integer id) {
		Optional<Employee> optionalId = empRepo.findById(id);
		if(optionalId.isPresent()) {
			Employee emp= optionalId.get();
			System.out.println(emp);
		}
	}
	
	public void getMultipleEmpIds() {
	Iterable<Integer> list=Arrays.asList(101,102);
	Iterable<Employee> itr=empRepo.findAllById(list);
	itr.forEach(System.out::println);
	}
	
	public void getAllEmployees() {
		Iterable<Employee> iterable = empRepo.findAll();
		iterable.forEach(System.out::println);
	}
	
	public void countOfRecords() {
		long count = empRepo.count();
		System.out.println(count);
	}
	
	public void getEmployeesByDepartment(String dept) {
		 List<Employee> empList = empRepo.findByDepartment(dept);
		 empList.forEach(System.out::println);
	}
	
	public void getEmployeesByDepartmentAndGender(String dept,String gender) {
		List<Employee> dataOfDepartmentAndGender = empRepo.findByDepartmentAndGender(dept, gender);
		dataOfDepartmentAndGender.forEach(System.out::println);
	}
	
	public void getEmployeesBySalaryGraterThanEquals(Double salary) {
		List<Employee> dataObject = empRepo.findByEmpSalaryIsGreaterThanEqual(salary);
		dataObject.forEach(System.out::println);
	}
	
	public void getAllEmployeeRecords() {
		List<Employee> allEmployeeRecords = empRepo.getAllEmployeeRecords();
		allEmployeeRecords.forEach(System.out::println);
	}
	
	public void getEmpById(Integer Id) {
		Employee empById = empRepo.getEmpById(Id);
		System.out.println(empById);
	}
	
	public void deleteEmp(Integer empId) {
		empRepo.deleteEmp(empId);
	}
	
	public void getEmpNamesWithSalary() {
		empNamesWithSalary = empRepo.getEmpNamesWithSalary();
		//empNamesWithSalary.forEach(System.out::println);
		for(EmployeeDetails data : empNamesWithSalary) {
			System.out.println(data.getEmpName()+","+data.getEmpSalary());
		}
	}
	
	public void fetchEmpNamesWuthSalary() {
	 empRepo.fetchEmpNamesWuthSalary().stream().map(obj -> obj[0]+","+obj[1]).forEach(System.out::println);
	 List<Object[]> fetchEmpNamesWithSalary = empRepo.fetchEmpNamesWuthSalary();
	 for(int i=0;i<fetchEmpNamesWithSalary.size();i++) {
		 System.out.println(fetchEmpNamesWithSalary.get(i)[0]+","+fetchEmpNamesWithSalary.get(i)[1]);
	 	}
	 }
	
	
	public void updateSalaryOfEmp(Integer empId) {
		empRepo.updateSalaryOfEmp(empId);
	}
	
	public void UpdateSalaryOfEmployee(Integer empId, Double empSalary) {
		empRepo.UpdateSalaryOfEmployee(empId, empSalary);
	}
	
	/*
	public void insertEmpData() {
		EmployeeTemp emp=new EmployeeTemp(103, "Raghu Ram", 30000.00, "male", "System engineer");
		empTemp.save(emp);
	}
	*/
	
	public void getDataUsingNativeQuery() {
		List<EmployeeTemp> allEmployeeRecords = empTemp.retriveData();
		allEmployeeRecords.forEach(System.out::println);
	}
	
	public void getDataUsingNativeQueryOfCopy() {
		empRepo.getEmployeeDataAfterCopy();
	}
	
	public void insertingDataOfexistingTablesCopy() {
		empRepo.insertingDataOfexistingTables();
	}
	
	public void deleteEmpTemp(Integer empId) {
		empTemp.deleteEmpTemp(empId);
	}
	
	public void insertingTableDatatoAnother() {
		EmployeeTemp emp=new EmployeeTemp(104, "Hari", 30000.00, "male", "System engineer");
		Integer empIdData = emp.getEmpId();
		empTemp.save(emp);
		empRepo.insertingDataOfexistingTables();
		empTemp.deleteEmpTemp(empIdData);
	}
	
	
	
}
