package in.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.raghu.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	@Query("from Employee")
	public List<Employee> fetchAllRecords();
	

}
