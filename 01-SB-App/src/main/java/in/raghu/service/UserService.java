package in.raghu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.raghu.UserDao;

@Component
public class UserService {
	
	private UserDao dao;
	
	/*
	@Autowired
	public UserService(@Qualifier("oracle") UserDao dao) {
		this.dao=dao;
	}
	*/
	
	@Autowired
	public UserService(UserDao dao) {
		this.dao=dao;
	}
	
	/*
	@Autowired
	public void setDao(UserDao dao) {
		System.out.println("User service DAO set method called");
		System.out.println(dao.getClass().getName());
		this.dao = dao;
		System.out.println(this.dao);
	}
	*/

	public void getUserName(Integer id) {
		String nameById = dao.findNameById(id);
		System.out.println(nameById);
	}
}
