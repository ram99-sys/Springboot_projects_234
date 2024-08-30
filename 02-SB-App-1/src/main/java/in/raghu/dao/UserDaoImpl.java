package in.raghu.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {

	@Override
	public boolean saveUser(String name, String email, String pwd) {
		System.out.println("Record inserted");
		return true;
	}

}
