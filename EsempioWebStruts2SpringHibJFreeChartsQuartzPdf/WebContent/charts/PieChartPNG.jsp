	<%@page import="net.appuntivari.struts2.jfreecharts.ChartComponent"%>
	<%@page import="net.appuntivari.struts2.utils.ConstantsUtil"%>
	<%@ page import="java.io.*" %>
	<%@ page import="org.jfree.chart.JFreeChart" %>
	<%@ page import="org.jfree.chart.ChartUtilities" %>
	<%@ page import="java.util.HashMap" %>
	<%@ page import="java.util.Map" %>
	<%@ page import="net.appuntivari.struts2.jfreecharts.ChartFactory" %>
	<%@ page import="net.appuntivari.struts2.jfreecharts.ChartParameter" %>
	
	<%@ page trimDirectiveWhitespaces="true" %>

	<%
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
	 
	 	FileInputStream fileInStream = new FileInputStream(exportChartComponent.getInfoContentType().getImage());
	 	OutputStream outStream = response.getOutputStream();   
	 
	 	long fileLength;
	 	byte[] byteStream;
	 
	 	fileLength = exportChartComponent.getInfoContentType().getImage().length();
	 	byteStream = new byte[(int)fileLength];
	 	fileInStream.read(byteStream, 0, (int)fileLength);
	 
	 	response.setContentType("image/png");
	 	response.setContentLength((int)fileLength);
	 	response.setHeader("Cache-Control",
	     "no-store,no-cache, must-revalidate, post-check=0, pre-check=0");
	 	response.setHeader("Pragma", "no-cache");
	 
	 	fileInStream.close();
	 	outStream.write(byteStream);
	 	outStream.flush();
	 	outStream.close();
	 
	 }catch (Exception e){
	 	e.printStackTrace();
	 }
%>