package in.raghu.service;

import org.springframework.stereotype.Service;

import in.raghu.entity.Employee;
import in.raghu.repo.EmployeeRepository;

@Service
public class EmployeeService {
	
	public EmployeeRepository empRepo;
	
	
	
	public EmployeeService(EmployeeRepository empRepo) {
		this.empRepo = empRepo;
	}


	public void saveData() {
		Employee emp=new Employee();
		emp.setEmpName("Raghu");
		emp.setEmpSalary(60000.00);
		emp.setGender("Male");
		emp.setDepartment("supply chain");
		empRepo.save(emp);
	}
}
