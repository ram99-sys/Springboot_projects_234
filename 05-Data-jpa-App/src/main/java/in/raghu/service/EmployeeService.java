package in.raghu.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.raghu.entity.Employee;

import in.raghu.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;

	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}
	
	public void getAllRecords() {
		List<Employee> fetchAllRecords = empRepo.fetchAllRecords();
		fetchAllRecords.forEach(System.out::println);
	}
	
	public void sortByRecords(String column) {
		Sort sort = Sort.by(column).ascending();
		List<Employee> fetchAllRecords = empRepo.findAll(sort);
		fetchAllRecords.forEach(System.out::println);
	}
	
	public void getEmpsWithPagination(int pageSize, int pageNo) {
		PageRequest of = PageRequest.of(pageNo-1, pageSize);
		Page<Employee> findAll = empRepo.findAll(of);
		findAll.forEach(obj -> System.out.println(obj));
	}


}
