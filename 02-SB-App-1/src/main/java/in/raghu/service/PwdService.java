package in.raghu.service;

import org.springframework.stereotype.Component;

@Component
public class PwdService {
	public String encryptPwd(String pwd) {
		System.out.println("Password encrypted...");
		return pwd;	
	}
}
