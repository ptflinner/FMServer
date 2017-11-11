package edu.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	public static Connection getMySQLConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    connectionProps.put("user", DatabaseConfig.MYSQL_USERNAME);
	    connectionProps.put("password", DatabaseConfig.MYSQL_PASSWORD);
	    

	    conn = DriverManager.getConnection(
	                   "jdbc:mysql://" + DatabaseConfig.MYSQL_HOST + ":" + DatabaseConfig.MYSQL_PORT + "/" + DatabaseConfig.MYSQL_DATABASE_TO_USE, connectionProps);
	    return conn;
	}
}