package REST;

import com.google.gson.Gson;

import edu.db.TripDatabase;
import model.Trip;
import results.trips.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/trip")
public class TripResource {
	
	@GET
	@Path("/employee/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTripsByEmployeeID(@PathParam("id") int id) {
		 System.out.println("GET - /trip/" + id);

	        GetTripsByEmployeeIdResult result = TripDatabase.getEmployeeTrips(id);
	        return Response
	                .status(Response.Status.OK)
	                .entity(new Gson().toJson(result))
	                .build();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTripByID(@PathParam("id") int id) {
		 System.out.println("GET - /trip/" + id);

	        GetTripByIdResult result = TripDatabase.getTripById(id);
	        return Response
	                .status(Response.Status.OK)
	                .entity(new Gson().toJson(result))
	                .build();
	}
	
	@PUT
	@Path("/update/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response updateTrip(@PathParam("id") int id, String trip) {
		System.out.println("PUT - /trip/" + id);

        Trip updatedTrip = new Gson().fromJson(trip, Trip.class);
        UpdateTripResult result = TripDatabase.updateTrip(updatedTrip, id);
        return Response
                .status(Response.Status.OK)
                .entity(new Gson().toJson(result))
                .build();
	}
}
