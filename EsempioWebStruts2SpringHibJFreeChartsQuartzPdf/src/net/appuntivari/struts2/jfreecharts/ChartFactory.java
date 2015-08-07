package net.appuntivari.struts2.jfreecharts;

import net.appuntivari.struts2.utils.ConstantsUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

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
