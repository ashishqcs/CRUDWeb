package com.midnight.CRUDWeb.TestFeatures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** This class is created to test the working of log4j.
 * This class contains its own main method which needs to be run as a 
 * java program.
*/
public class Testlog {
	
	static Logger log = LogManager.getLogger(Testlog.class);
	public static void main(String[] args) {
		
		System.out.println("Enter Logging");
		log.debug("debug");
		log.fatal("fatal");
	}
}
