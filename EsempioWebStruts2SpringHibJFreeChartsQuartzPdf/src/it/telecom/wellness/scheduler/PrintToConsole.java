package it.telecom.wellness.scheduler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PrintToConsole {
	
	public static Log log = LogFactory.getLog(PrintToConsole.class);

	
	public void printMe() {
		log.info("Stringa generata dalla combinazione Spring+Quartz");
	}
}
