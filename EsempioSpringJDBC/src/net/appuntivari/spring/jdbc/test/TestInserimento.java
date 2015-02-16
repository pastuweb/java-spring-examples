package net.appuntivari.spring.jdbc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import net.appuntivari.spring.jdbc.dto.Autori;
import net.appuntivari.spring.jdbc.dto.Notes;
import net.appuntivari.spring.jdbc.service.Service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class TestInserimento {

	public static Log log = LogFactory.getLog("TestInserimento");
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{
				"context.xml"				
		});
			
		Service service = (Service)
			ctx.getBean("beanService"); //recupero il Bean che usa la classe Service
		

		/*Inserisco nel DB una NOTA inizializzata dal Bean di Spring */
		Notes nuovaNota = (Notes)
				ctx.getBean("beanNuovaNota");
		service.insertNuovaNota(nuovaNota);
		
		/*Inserisco nel DB un AUTORE inizializzato dal Bean di Spring */
		Autori nuovoAutore = (Autori)
				ctx.getBean("beanNuovoAutore");
		service.insertNuovoAutore(nuovoAutore);
	}
	
}
