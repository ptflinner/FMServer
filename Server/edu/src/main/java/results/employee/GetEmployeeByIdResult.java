package results.employee;

import model.Employee;

public class GetEmployeeByIdResult {
	private int id;
	private Employee employee;
	public GetEmployeeByIdResult(int id, Employee employee) {
		super();
		this.id = id;
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
