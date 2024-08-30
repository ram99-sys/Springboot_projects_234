package in.raghu;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		EmployeeService bean = context.getBean(EmployeeService.class);
		bean.getEmployeeData();
		String path="C:\\\\documents\\\\data.xlsx";
		try {
			bean.exportDataToExcel(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		bean.getAllEmployeesData();
	}

}
