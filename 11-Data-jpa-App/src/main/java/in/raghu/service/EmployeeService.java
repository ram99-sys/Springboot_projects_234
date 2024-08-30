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
		Employee employee = new Employee();
		employee.setSalary(30000.00);
		employee.setDesignation("Engineer");
		empRepo.save(employee);
	}
	
}
