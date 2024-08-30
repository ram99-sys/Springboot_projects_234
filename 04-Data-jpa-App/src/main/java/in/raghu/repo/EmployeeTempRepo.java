package in.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.raghu.entity.EmployeeTemp;

@Repository
public interface EmployeeTempRepo extends CrudRepository<EmployeeTemp, Integer> {

	@Query(nativeQuery=true, value="select * from employee_temp")
	public List<EmployeeTemp> retriveData();
	
	@Transactional
	@Modifying
	@Query("delete from EmployeeTemp where empId = :empId")
	public void deleteEmpTemp(Integer empId);
}
