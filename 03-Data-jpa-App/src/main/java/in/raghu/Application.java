package in.raghu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.raghu.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		BookRepository bean=context.getBean(BookRepository.class);
		System.out.println(bean.getClass().getName());
		
		Book book=new Book();
		book.setBookId(102);
		book.setBookName("aws");
		book.setBookPrice(1600.00);
		
		bean.save(book);
	}

}
