package it.telecom.wellness.jfreecharts;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class InfoContentType {
	
	public static Log log = LogFactory.getLog(InfoContentType.class);
	
	private Document document; 
	private ByteArrayOutputStream baos;
	private File image;
	
	
	public InfoContentType(JFreeChart chart){
		
		Document document = new Document();
		
		try {
			image = new File("C:\\tmp\\image.png");
			
			baos = new ByteArrayOutputStream();
			PdfWriter.getInstance(document, baos);
			
			document.open();
				Font fontSize18 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.RED);
				Paragraph p1 = new Paragraph(chart.getTitle().getText(), fontSize18);
				p1.setAlignment(Element.ALIGN_CENTER);
				document.add(p1);
				document.add(Chunk.NEWLINE);
				
				long fileLength = image.length();
				byte[] byteStream = new byte[(int)fileLength];
				ChartUtilities.saveChartAsPNG(image, chart, 500, 350);
				FileInputStream fileInStream = new FileInputStream(image);
			 	fileInStream.read(byteStream, 0, (int)fileLength);
			 	
				document.add(Image.getInstance("C:\\tmp\\image.png"));
			document.close();
			
			log.info("document, baos and image CREATED");
		} catch (DocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public Document getPdfDocument(){
		return this.document;
	}
	public ByteArrayOutputStream getBaos(){
		return this.baos;
	}
	public File getImage(){
		return this.image;
	}
}
