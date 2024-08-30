package in.raghu.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	public boolean sendEmail(String to, String subject, String body) {
		//logic sent to mail
		System.out.println("Email sent to user...");
		
		return true;
	}
}
