package net.appuntivari.struts2.scheduler;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class JobPrintToConsole extends QuartzJobBean {

		public static Log log = LogFactory.getLog(JobPrintToConsole.class);

		private PrintToConsole printToConsole;

		public void setPrintToConsole(PrintToConsole ptc) {
			this.printToConsole = ptc;
		}

		protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
			printToConsole.printMe();
		}
	
}
