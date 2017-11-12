package edu.db;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import edu.db.EmployeeContract.EmployeeEntry;
import model.Employee;

import java.sql.*;
import results.employee.*;
public class EmployeeDatabase {
	 private static Connection connection = ConnectionUtil.getConnection();
	 
	 public static GetEmployeesResult getEmployees() {
		  	String sql = "SELECT * FROM users ORDER BY id;";
	        List<Employee> employees = new ArrayList<>();
	        boolean success = false;

	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                employees.add(toEmployee(resultSet));
	            }

	            success = true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	        return new GetEmployeesResult(employees);
	 }
	 
	 public static GetEmployeeByIdResult getEmployeeById(int id) {
		 String sql = "SELECT * FROM users WHERE id=? ORDER BY id;";
	       	Employee employee = null;
	        try {
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, id);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                employee = toEmployee(resultSet);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return new GetEmployeeByIdResult(id, employee);
		 
	 }
	 
	 public static LoginEmployeeResult loginEmployee(Employee potentialEmployee) {
		  String sql = "SELECT * FROM users WHERE email=? AND password=? LIMIT 1";
	        Employee employee = null;

	        try {
	            PreparedStatement statement = connection.prepareStatement(sql);
	            statement.setString(1, potentialEmployee.getLicenseNumber());
	            statement.setString(2, potentialEmployee.getPassword());
	            ResultSet resultSet = statement.executeQuery();

	            if (resultSet.next()) {
	                employee = toEmployee(resultSet);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return new LoginEmployeeResult(potentialEmployee.getLicenseNumber(), potentialEmployee.getPassword(), employee);
	 }
	 
	  private static Employee toEmployee(ResultSet resultSet) throws SQLException {
	        int id = resultSet.getInt(EmployeeEntry.ID);
	        String firstName = resultSet.getString(EmployeeEntry.FIRST_NAME);
	        String lastName = resultSet.getString(EmployeeEntry.LAST_NAME);
	        String middleName = resultSet.getString(EmployeeEntry.MIDDLE_NAME);
	        String password = resultSet.getString(EmployeeEntry.PASSWORD);
	        Date dateOfBirth = resultSet.getDate(EmployeeEntry.DOB);
	        String phoneNumber=resultSet.getString(EmployeeEntry.PHONE_NUMBER);
	        String licenseNumber=resultSet.getString(EmployeeEntry.LICENSE_NUMBER);
	        
	        return new Employee(id, firstName, lastName, middleName,dateOfBirth,phoneNumber,licenseNumber,password);
	    }
}
