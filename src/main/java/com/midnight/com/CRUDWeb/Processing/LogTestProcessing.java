package com.midnight.com.CRUDWeb.Processing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogTestProcessing {
	
	private Logger logger = LogManager.getLogger(LogTestProcessing.class.getName());
	
	public void test() {
		logger.trace("Calling Trace");
		logger.debug("Calling Debug");
		logger.warn("Calling Warn");
	}
}
