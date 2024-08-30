package in.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService implements CommandLineRunner {
	
	public EmployeeServiceDev empServiceDev;
	
	public EmployeeServiceProd empServiceProd;
	
	
	public EmployeeService(@Qualifier("empServiceDev") EmployeeServiceDev empServiceDev,@Qualifier("empServiceProd") EmployeeServiceProd empServiceProd) {
		this.empServiceDev = empServiceDev;
		this.empServiceProd = empServiceProd;
	}




	@Override
	public void run(String... args) throws Exception {
		empServiceProd.createEmployee();
		System.out.println("Employee");
		empServiceProd.fetchEmployee();
		empServiceDev.createEmployee();
		empServiceDev.fetchEmployee();
	}
	
	
	
	
}
