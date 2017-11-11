package results.trips;

import model.Trip;

public class UpdateTripResult {
	private int id;
	private Trip trip;
	public UpdateTripResult(int id, Trip trip) {
		super();
		this.id = id;
		this.trip = trip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	
	
}
