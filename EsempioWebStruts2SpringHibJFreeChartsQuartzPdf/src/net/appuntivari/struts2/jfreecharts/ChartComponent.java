package net.appuntivari.struts2.jfreecharts;

import org.jfree.chart.JFreeChart;

public interface ChartComponent{
	public JFreeChart getChart();
	public InfoContentType getInfoContentType();
}
