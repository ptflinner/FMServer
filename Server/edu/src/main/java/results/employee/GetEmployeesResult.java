package results.employee;

import java.util.List;

import model.Employee;

public class GetEmployeesResult {
	private List<Employee> employees;

	public GetEmployeesResult(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
