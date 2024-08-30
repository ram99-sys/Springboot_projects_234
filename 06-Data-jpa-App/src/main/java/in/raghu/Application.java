package in.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.entity.ContactUsEntity;
import in.raghu.repo.ContactUsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactUsRepository bean = context.getBean(ContactUsRepository.class);
		
		ContactUsEntity contactUsEntity = new ContactUsEntity();
		contactUsEntity.setName("Vikas");
		contactUsEntity.setPhoneNo("1234534584");
		contactUsEntity.setEmail("Vikas@gmail.com");
		
		bean.save(contactUsEntity);
	}

}
