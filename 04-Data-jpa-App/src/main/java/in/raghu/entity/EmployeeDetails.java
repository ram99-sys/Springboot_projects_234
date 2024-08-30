package in.raghu.entity;

public class EmployeeDetails {
	private String empName;
	private Double empSalary;
	
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
	
	public EmployeeDetails(String empName, Double empSalary) {
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	
}
