package in.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.raghu.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	//create a stored procedure in DB
	/*
	CREATE DEFINER=`root`@`localhost` PROCEDURE `GetAllEmployees`()
	BEGIN
		SELECT * FROM employee where employee.emp_id=103;
	END
	 */
	@Query(value="CALL GetAllEmployees()", nativeQuery=true)
	public List<Employee> getAllEmployees();
}
