package REST;
import com.google.gson.Gson;

import edu.db.EmployeeDatabase;
import model.Employee;
import results.employee.*;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/employee")
public class EmployeeResource{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployees() {
    	 System.out.println("GET - /employees");

         GetEmployeesResult result = EmployeeDatabase.getEmployees();
         return Response
                 .status(Response.Status.OK)
                 .entity(new Gson().toJson(result))
                 .build();
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") int id) {
        System.out.println("GET - /user/" + id);

        GetEmployeeByIdResult result = EmployeeDatabase.getEmployeeById(id);
        return Response
                .status(Response.Status.OK)
                .entity(new Gson().toJson(result))
                .build();
    }
    
    @POST
    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginUser(String employee) {
    	 System.out.println("POST - /user/login");

         /* will definitely contains email & password for logging in*/
         Employee potentialUser = new Gson().fromJson(employee, Employee.class);
         LoginEmployeeResult result = EmployeeDatabase.loginEmployee(potentialUser);
         return Response
                 .status(Response.Status.OK)
                 .entity(new Gson().toJson(result))
                 .build();
    }
    
}