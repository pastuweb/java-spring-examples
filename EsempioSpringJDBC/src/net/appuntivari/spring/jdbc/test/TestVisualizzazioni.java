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





public class TestVisualizzazioni {

	public static Log log = LogFactory.getLog("TestVisualizzazioni");
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{
				"context.xml"				
		});

		
		/*Visualizzo Autore inizializzato dal Bean di Spring*/
		Autori guest = (Autori)
				ctx.getBean("beanAutoreGuest");
		
		log.info("Nome = "+guest.getNome());
		log.info("Cognome = "+guest.getCognome());
		
	}
	
}
