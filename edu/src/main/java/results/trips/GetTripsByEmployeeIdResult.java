package results.trips;

import java.util.List;

import model.Trip;

public class GetTripsByEmployeeIdResult {
	private int id;
	private List<Trip> trips;
	public GetTripsByEmployeeIdResult(int id, List<Trip> trips) {
		super();
		this.id = id;
		this.trips = trips;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Trip> getTrips() {
		return trips;
	}
	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}
	
	
}
