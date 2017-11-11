package edu.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseAccessor {
	public static final String LIST_TRIPS="Select * from Trips Where employee_id=? ORDER BY finish_time desc";
	public static final String EMPLOYEE_UNDERLING_TRIPS="Select * from Trips ORDER BY employee_id";
	public static final String EXACT_TRIP="Select * from Trips where id=?";
	public static final String TRIP_FIELDS="Select purpose,project_function,task_order,project_title from Trips where id=?";
	public static final String INSERT_TRIP="Update Trips Set project_title=?,project_function=?,purpose=?,task_order=?";
	public static final String ADD_TRIP="Insert Into Trips(project_title,trip_path,purpose,project_function,task_order,initial_odometer,final_odometer,vehicle_id,employee_id,start_time,finish_time) VALUES(?,?,?,?,?,?,?,?,?,?,?);";
}
