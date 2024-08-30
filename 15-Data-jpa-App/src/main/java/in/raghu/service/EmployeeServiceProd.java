package in.raghu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import in.raghu.entity.Employee;
import in.raghu.repo.EmployeeRepo;

@Service
@Profile("prod")
public class EmployeeServiceProd implements EmplyeeServiceInterface {
	
	@Autowired
	private EmployeeRepo empRepo;

	@Override
	public void createEmployee() {
		Employee emp=new Employee();
		emp.setName("Naveen");
		emp.setSalary(80000.00);
		emp.setDesignation("consultant");
		empRepo.save(emp);
		System.out.println("employee record inserted");
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchEmployee() {
		List<Employee> list = empRepo.findAll();
		list.forEach(System.out::println);
		
	}

}
