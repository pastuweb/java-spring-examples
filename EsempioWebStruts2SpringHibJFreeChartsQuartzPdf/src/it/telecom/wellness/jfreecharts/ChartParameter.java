package it.telecom.wellness.jfreecharts;

import java.util.Map;

public class ChartParameter {
	
	private String applicationTitle;
	private String chartTitle;
	private Map<String, Integer> dati;
	
	public String getApplicationTitle() {
		return applicationTitle;
	}
	public void setApplicationTitle(String applicationTitle) {
		this.applicationTitle = applicationTitle;
	}
	public String getChartTitle() {
		return chartTitle;
	}
	public void setChartTitle(String chartTitle) {
		this.chartTitle = chartTitle;
	}
	public Map<String, Integer> getDati() {
		return dati;
	}
	public void setDati(Map<String, Integer> dati) {
		this.dati = dati;
	}
	
	
	
	

}
