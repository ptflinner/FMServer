package edu.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import edu.db.TripContract.TripEntry;
import model.Trip;
import results.trips.*;

public class TripDatabase {
	private static Connection connection = ConnectionUtil.getConnection();
	
	public static GetTripByIdResult getTripById(int id) {
		String sql = "SELECT * FROM Trips WHERE id=? ;";
       	Trip trip = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                trip = toTrip(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new GetTripByIdResult(id,trip);
	 
	}
	
	public static GetTripsByEmployeeIdResult getEmployeeTrips(int id) {
	  	String sql = "SELECT * FROM Trips WHERE employee_id=? ORDER BY finish_time;";
        List<Trip> trip = new ArrayList<>();
        boolean success = false;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                trip.add(toTrip(resultSet));
            }

            success = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return new GetTripsByEmployeeIdResult(id,trip);
	}
	
	public static UpdateTripResult updateTrip(Trip trip,int id) {
		 String sql = "UPDATE Trips SET project_title = ?, project_function=?, purpose=?,task_order=? WHERE id = ?";
	        int rowsUpdated = 0;
	        try {
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setString(1, trip.getProjectTitle());
	            statement.setString(2, trip.getFunction());
	            statement.setString(3, trip.getPurpose());
	            statement.setString(4, trip.getTaskOrder());
	            statement.setInt(5, trip.getId());
	            rowsUpdated = statement.executeUpdate();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return new UpdateTripResult(id, trip);
	}
	
	private static Trip toTrip(ResultSet resultSet) throws SQLException {
		int id=resultSet.getInt(TripEntry.ID);
		String projectTitle=resultSet.getString(TripEntry.PROJECT_TILE);
		String tripPath=resultSet.getString(TripEntry.TRIP_PATH);
		String purpose=resultSet.getString(TripEntry.PURPOSE);
		String function=resultSet.getString(TripEntry.PROJECT_FUNCTION);
		String taskOrder=resultSet.getString(TripEntry.TASK_ORDER);
		int initialOdometer=resultSet.getInt(TripEntry.INITIAL_ODOMETER);
		int finalOdometer=resultSet.getInt(TripEntry.FINAL_ODOMETER);
		int vehicleId=resultSet.getInt(TripEntry.VEHICLE_ID);
		int employeeId=resultSet.getInt(TripEntry.EMPLOYEE_ID);
		Date startTime=resultSet.getDate(TripEntry.START_TIME);
		Date finishTime=resultSet.getDate(TripEntry.FINISH_TIME);
		
		return new Trip(id,projectTitle,tripPath,purpose,function,taskOrder,initialOdometer,finalOdometer,vehicleId,employeeId,startTime,finishTime);
	}
}
