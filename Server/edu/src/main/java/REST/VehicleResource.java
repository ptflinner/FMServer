package REST;

import com.google.gson.Gson;

import edu.db.VehicleDatabase;
import results.vehicle.GetVehicleByIdResult;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/vehicle")
public class VehicleResource {
	
	@GET
	@Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Response getVehicleByID(@PathParam("id") int id) {
		 System.out.println("GET - /vehicle/" + id);

	        GetVehicleByIdResult result = VehicleDatabase.getVehicleById(id);
	        return Response
	                .status(Response.Status.OK)
	                .entity(new Gson().toJson(result))
	                .build();
	}
}
