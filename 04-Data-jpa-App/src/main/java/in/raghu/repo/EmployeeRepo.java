package in.raghu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.raghu.entity.Employee;
import in.raghu.entity.EmployeeDetails;
import in.raghu.entity.EmployeeTemp;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {


	public List<Employee> findByDepartment(String dept);
	
	public List<Employee> findByDepartmentAndGender(String department,String Gender);
	
	public List<Employee> findByEmpSalaryIsGreaterThanEqual(Double salary);
	
	@Query("from Employee")
	public List<Employee> getAllEmployeeRecords();
	
	@Query("from Employee where empId = :empId")
	public Employee getEmpById(Integer empId);
	
	@Transactional
	@Modifying
	@Query("delete from Employee where empId = :empId")
	public void deleteEmp(Integer empId);
	
	
	//select specific cloumns
	@Query("select new in.raghu.entity.EmployeeDetails(e.empName, e.empSalary) from Employee e")
	public List<EmployeeDetails> getEmpNamesWithSalary();
	
	@Query("select empName,empSalary from Employee")
	public List<Object[]> fetchEmpNamesWuthSalary();
	
	
	//Update salary of employee
	@Transactional
	@Modifying
	@Query("update Employee set empSalary=60000 where empId = :empId")
	public void updateSalaryOfEmp(Integer empId);
	
	
	//update salary of employee by using positional parameters
	@Transactional
	@Modifying
	@Query("update Employee set empSalary= :empSalary where empId = :empId")
	public void UpdateSalaryOfEmployee(Integer empId, Double empSalary);
	
	
	//creating a new table and coping the data
	@Transactional
	@Modifying
	@Query(nativeQuery=true, value="create table employee_copy as select * from employee")
	public void getEmployeeDataAfterCopy();
	
	
	//inserting the data for already existing tables
	@Transactional
	@Modifying
	@Query(nativeQuery=true, value="insert into employee select * from employee_temp")
	public void insertingDataOfexistingTables();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
