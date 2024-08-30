package in.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.raghu.dao.UserDao;

@Component
public class UserService {
	
	public PwdService pwdService;
	public UserDao userDao;
	public EmailService emailService;
	
	
	
	@Autowired
	public void setPwdService(PwdService pwdService) {
		this.pwdService = pwdService;
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Autowired
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}




	public void registerUser(String name, String email, String pwd) {
		//encrypt pwd
		String encryptPwd = pwdService.encryptPwd(pwd);
		//save user to DB
		boolean isSaved = userDao.saveUser(name, email, encryptPwd);
		//sent mail to user
		if(isSaved) {
			boolean isSent = emailService.sendEmail(email, "Test Subject", "Test Password");
			if(isSent) {
				System.out.println("User registration completed");
			}
		}
	}

}
