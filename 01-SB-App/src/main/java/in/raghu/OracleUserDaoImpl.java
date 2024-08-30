package in.raghu;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleUserDaoImpl implements UserDao {
	
	public OracleUserDaoImpl() {
		System.out.println("Oracle User Dao Implementation class constructor");
	}

	@Override
	public String findNameById(Integer id) {
		if(id==100) {
			return "Raju";
		}
		return "No records";
	}

}
