package in.raghu.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String gender;
	private String department;
	
	
	public Employee(Integer empId, String empName, Double empSalary, String gender, String department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.gender = gender;
		this.department = department;
	}
	
	
	public Integer getEmpId() {
		return empId;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", gender=" + gender
				+ ", department=" + department + "]";
	}

}
