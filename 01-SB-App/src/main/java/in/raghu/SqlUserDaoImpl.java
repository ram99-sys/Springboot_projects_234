package in.raghu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
@Primary
public class SqlUserDaoImpl implements UserDao{
	public SqlUserDaoImpl() {
		System.out.println("Sql User Dao Implementation class constructor");
	}

	@Override
	public String findNameById(Integer id) {
		if(id==100) {
			return "Raju";
		}
		return "No records";
	}
}
