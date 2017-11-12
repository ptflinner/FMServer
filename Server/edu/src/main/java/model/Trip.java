package model;

import java.util.Date;

public class Trip {
	private int id;
	private String projectTitle;
	private String tripPath;
	private String purpose;
	private String function;
	private String taskOrder;
	private int initialOdometer;
	private int finalOdometer;
	private int employeeId;
	private int vehicleId;
	private Date startTime;
	private Date finishTime;
	public Trip(int id, String projectTitle, String tripPath, String purpose, String function, String taskOrder,
			int initialOdometer, int finalOdometer, int employeeId, int vehicleId, Date startTime,
			Date finishTime) {
		super();
		this.id = id;
		this.projectTitle = projectTitle;
		this.tripPath = tripPath;
		this.purpose = purpose;
		this.function = function;
		this.taskOrder = taskOrder;
		this.initialOdometer = initialOdometer;
		this.finalOdometer = finalOdometer;
		this.employeeId = employeeId;
		this.vehicleId = vehicleId;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public String getTripPath() {
		return tripPath;
	}
	public void setTripPath(String tripPath) {
		this.tripPath = tripPath;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	public String getTaskOrder() {
		return taskOrder;
	}
	public void setTaskOrder(String taskOrder) {
		this.taskOrder = taskOrder;
	}
	public int getInitialOdometer() {
		return initialOdometer;
	}
	public void setInitialOdometer(int initialOdometer) {
		this.initialOdometer = initialOdometer;
	}
	public int getFinalOdometer() {
		return finalOdometer;
	}
	public void setFinalOdometer(int finalOdometer) {
		this.finalOdometer = finalOdometer;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	
	
}
