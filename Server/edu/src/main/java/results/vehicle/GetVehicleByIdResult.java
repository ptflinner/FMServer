package results.vehicle;

import model.Vehicle;

public class GetVehicleByIdResult {
	private int id;
	private Vehicle vehicle;
	public GetVehicleByIdResult(int id, Vehicle vehicle) {
		super();
		this.id = id;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
}
