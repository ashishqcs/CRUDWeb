package com.midnight.CRUDWeb.TestFeatures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is created to check the connectivity to the database.
 * This class contains its own main method which needs to be run as a 
 * java program.
*/
public class TestJDBC {
	
	private static Logger log = LogManager.getLogger(TestJDBC.class);
	
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			
			log.info("Creating JDBC Connection...");
			
			Connection con = DriverManager.getConnection(jdbcUrl,user,pass);
			
			log.info("Connection Successful !!! :-)");
			
		}catch(SQLException e) {
			
			log.error("Connection to database failed !");
			e.printStackTrace();}
		
		
	}
}
