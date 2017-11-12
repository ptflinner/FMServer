package edu.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import edu.db.VehicleContract.VehicleEntry;
import model.Vehicle;
import results.vehicle.*;

public class VehicleDatabase {
	private static Connection connection = ConnectionUtil.getConnection();

	 public static GetVehicleByIdResult getVehicleById(int id) {
		 String sql = "SELECT * FROM Vehicles WHERE id=? ;";
	       	Vehicle vehicle = null;
	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, id);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                vehicle = toVehicle(resultSet);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return new GetVehicleByIdResult(id, vehicle);
	 }
	 
	 private static Vehicle toVehicle(ResultSet resultSet) throws SQLException{
		 int id=resultSet.getInt(VehicleEntry.ID);
		 String make=resultSet.getString(VehicleEntry.MAKE);
		 String model=resultSet.getString(VehicleEntry.MODEL);
		 String plateNumber=resultSet.getString(VehicleEntry.PLATE_NUMBER);
		 String color=resultSet.getString(VehicleEntry.COLOR);
		 String modelYear=resultSet.getString(VehicleEntry.MODEL_YEAR);
		 String modelTrim=resultSet.getString(VehicleEntry.MODEL_TRIM);
		 int odometer=resultSet.getInt(VehicleEntry.ODOMETER);
		 Date lastService=resultSet.getDate(VehicleEntry.LAST_SERVICE);
		 Date nextService=resultSet.getDate(VehicleEntry.NEXT_SERVICE);
		 
		 return new Vehicle(id,make,model,plateNumber,color,modelYear,modelTrim,odometer,lastService,nextService);
	 }
}
