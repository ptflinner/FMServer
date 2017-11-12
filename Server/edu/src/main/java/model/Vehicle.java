package model;

import java.util.Date;

public class Vehicle {
	private int id;
	private String make;
	private String model;
	private String plateNumber;
	private String color;
	private String modelYear;
	private String modelTrim;
	private int odometer;
	private Date lastService;
	private Date nextService;
	public Vehicle(int id, String make, String model, String plateNumber, String color, String modelYear,
			String modelTrim, int odometer, Date lastService, Date nextService) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.plateNumber = plateNumber;
		this.color = color;
		this.modelYear = modelYear;
		this.modelTrim = modelTrim;
		this.odometer = odometer;
		this.lastService = lastService;
		this.nextService = nextService;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelYear() {
		return modelYear;
	}
	public void setModelYear(String modelYear) {
		this.modelYear = modelYear;
	}
	public String getModelTrim() {
		return modelTrim;
	}
	public void setModelTrim(String modelTrim) {
		this.modelTrim = modelTrim;
	}
	public int getOdometer() {
		return odometer;
	}
	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}
	public Date getLastService() {
		return lastService;
	}
	public void setLastService(Date lastService) {
		this.lastService = lastService;
	}
	public Date getNextService() {
		return nextService;
	}
	public void setNextService(Date nextService) {
		this.nextService = nextService;
	}
	
	
}
