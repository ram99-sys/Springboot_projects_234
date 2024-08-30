package in.raghu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import in.raghu.repo.EmployeeRepo;
import in.raghu.service.EmployeeService;
import in.raghu.service.EmployeeServiceDev;
import in.raghu.service.EmployeeServiceProd;

@Configuration
public class AppConfig {
	@Bean
    @Profile("dev")
    public EmployeeServiceDev employeeServiceDev() {
        return new EmployeeServiceDev();
    }

    @Bean
    @Profile("prod")
    public EmployeeServiceProd employeeServiceProd() {
        return new EmployeeServiceProd();
    }
    
    @Bean
    public EmployeeService employeeServiceRunner(EmployeeServiceDev employeeServiceDev, EmployeeServiceProd employeeServiceProd) {
        return new EmployeeService(employeeServiceDev, employeeServiceProd);
    }
}
