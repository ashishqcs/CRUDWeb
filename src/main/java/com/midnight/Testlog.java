package com.midnight;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Testlog {
	
	static Logger log = LogManager.getLogger(Testlog.class);
	public static void main(String[] args) {
		
		System.out.println("Enter Logging");
		log.debug("debug");
		log.fatal("fatal");
	}
}
