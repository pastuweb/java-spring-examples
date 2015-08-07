package it.telecom.wellness.export;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import it.telecom.wellness.jfreecharts.ChartComponent;
import it.telecom.wellness.jfreecharts.ChartFactory;
import it.telecom.wellness.jfreecharts.ChartParameter;
import it.telecom.wellness.utils.ConstantsUtil;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;







import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DownloadPdfChart extends HttpServlet {
	
	private static final long serialVersionUID = 3007041234422726233L;
	public static Log log = LogFactory.getLog(DownloadPdfChart.class);
	
	@Override
	public void init(ServletConfig request) throws ServletException {
		super.init(request);	
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		log.info("\n ###################### DownloadPdfChart Servlet ###################### \n");
		
		try{
			String totPA;
		 	String totME;
		 	String totSE;
		 	
		 	totPA =  request.getParameter("totPA");
		 	totME =  request.getParameter("totME");
		 	totSE =  request.getParameter("totSE");
		 	
			Map<String, Integer> dati = new HashMap<String, Integer>();
	    	dati.put("PA", Integer.parseInt(totPA));
	    	dati.put("ME", Integer.parseInt(totME));
	    	dati.put("SE", Integer.parseInt(totSE));
	    	    	
	    	ChartParameter chartParameter = new ChartParameter();
	    	chartParameter.setChartTitle("Comparazione");
	    	chartParameter.setApplicationTitle("Ruoli Utenti");
	    	chartParameter.setDati(dati);
	    	
	    	ChartComponent exportChartComponent = ChartFactory.getChartComponent(ConstantsUtil.PIE_CHART, chartParameter);	 	

	    	response.setContentType("application/pdf");
			response.setHeader("Content-Disposition", "inline; filename=\"pdf_"+exportChartComponent.getChart().getTitle().getText()+".pdf\"");
			BufferedInputStream in = new BufferedInputStream(new ByteArrayInputStream(exportChartComponent.getInfoContentType().getBaos().toByteArray()));
	    	BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
	    	
	    	byte[] buf = new byte[1024];
		  	int nRead;
		  	while( (nRead=in.read(buf)) != -1 ){
		  	      out.write(buf,0,nRead);
		  	}

		  	
		  	out.flush();
		  	response.flushBuffer(); 
		  	in.close();
		  	out.close();
		  	response.getOutputStream().close();
	    	
		}catch (Exception e){
		 	e.printStackTrace();
		 }
	}

}
