package it.telecom.wellness.jfreecharts;

import it.telecom.wellness.actions.UtenteCRUDActions;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


public class PieChart implements ChartComponent{

  public static Log log = LogFactory.getLog(UtenteCRUDActions.class);
  private JFreeChart chart;
  
  public PieChart(ChartParameter chartParameter) {
        
        PieDataset dataset = createDataset(chartParameter.getDati());
        log.info("Created DataSet");

        chart = createChart(dataset, chartParameter.getChartTitle());
        log.info("Created Chart");
        
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        
    }
    
    private  PieDataset createDataset(Map<String, Integer> dati) {
        DefaultPieDataset result = new DefaultPieDataset();

        for(String key : dati.keySet()){
        	result.setValue(key, dati.get(key));
        }

        return result;
    }

    private JFreeChart createChart(PieDataset dataset, String title) {
        
    	JFreeChart tempChart = ChartFactory.createPieChart3D(title,          // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false);

        return tempChart;
        
    }

    @Override
	public JFreeChart getChart() {
		return this.chart;
	}

	@Override
	public InfoContentType getInfoContentType() {
		return new InfoContentType(chart);
	}
    
} 