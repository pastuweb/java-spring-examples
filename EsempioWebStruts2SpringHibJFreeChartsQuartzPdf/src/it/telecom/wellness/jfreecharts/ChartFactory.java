package it.telecom.wellness.jfreecharts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import it.telecom.wellness.utils.ConstantsUtil;

public class ChartFactory {

	public static Log log = LogFactory.getLog(ChartFactory.class);
	
	public static ChartComponent getChartComponent(String sourceType, ChartParameter chartParameter){
		if(sourceType.equals(ConstantsUtil.PIE_CHART)){
			log.info(ConstantsUtil.PIE_CHART);
			return new PieChart(chartParameter);
		}
		return null;
	}

}
