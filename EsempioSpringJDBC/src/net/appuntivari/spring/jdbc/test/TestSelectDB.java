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





public class TestSelectDB {

	public static Log log = LogFactory.getLog("TestSelectDB");
	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{
				"context.xml"				
		});
			
		Service service = (Service)
			ctx.getBean("beanService"); //recupero il Bean che usa la classe Service
		
		List<Notes> elenco = service.getElencoNotes();
		log.info("\n\n\n##### Elenco delle Note:");
		for (int i = 0; i < elenco.size(); i++) {
			log.info("nota: "+elenco.get(i).getNote());
		}
		
		log.info("\n\n");
		
		List<Notes> elencoFiltrato = service.getElencoNotesByChiave("JDBC");
		log.info("\n\n\n##### Elenco delle Note per chiave 'JDBC':");
		for (int i = 0; i < elencoFiltrato.size(); i++) {
			log.info("nota: "+elencoFiltrato.get(i).getNote());
		}
		
		log.info("\n\n");
		
		List<Object[]> elencoFiltratoNome = service.getElencoNotesByAutore("Fra");
		log.info("\n\n\n##### Elenco delle Note per autore 'Fra':");
		for(Object[] obj : elencoFiltratoNome){
			log.info("nota: "+obj[0].toString());
			log.info("--nome: "+obj[1].toString());
			log.info("--cognome: "+obj[2].toString());
		}
		
		log.info("\n\n");
		
		List<Object[]> elencoInfoImportanti = service.getElencoNoteWithJoins();
		log.info("\n\n\n##### Elenco di tutte le Note (info importanti):");
		for(Object[] obj : elencoInfoImportanti){
			log.info("nota: "+obj[0].toString());
			log.info("--nome: "+obj[1].toString());
			log.info("--cognome: "+obj[2].toString());
			log.info("--dominio: "+obj[3].toString());

		}
		
		
		
		List<Autori> elencoAutori = service.getElencoAutori();
		log.info("\n\n\n##### Elenco degli Autori:");
		for (int i = 0; i < elencoAutori.size(); i++) {
			log.info("nome: "+elencoAutori.get(i).getNome());
			log.info("cognome: "+elencoAutori.get(i).getCognome());
		}
		
		
		
	}

	
}
