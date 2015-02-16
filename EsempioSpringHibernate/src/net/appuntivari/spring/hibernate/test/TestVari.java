package net.appuntivari.spring.hibernate.test;

import java.util.ArrayList;
import java.util.List;


import net.appuntivari.spring.hibernate.dao.Service;
import net.appuntivari.spring.hibernate.dto.Autori;
import net.appuntivari.spring.hibernate.dto.Notes;
import net.appuntivari.spring.hibernate.dto.Siti;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestVari {

	
	public static void main(String[] args) {
		
		/* Carico il contesto di Spring */
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[]{
				"net/appuntivari/config/spring/spring_hibernate_config.xml"				
		});
		
		Service service = (Service) ctx.getBean("dbService");

		
/* TEST INSERIMENTO o AGGIORNAMENTO DI UN Autore E di un Sito */
		//Creo un Autore
		Autori autore = new Autori();
		autore.setId_autore(14); //se settato, createAutore() va in UPDATE
		autore.setNome("Francesco");
		autore.setCognome("Pasturenzi");
				
		
		//Creo un Sito
		Siti sito = new Siti();
		sito.setDominio("www.pastuweb.it");
		sito.setTipologia("personale");
		
		autore.setSito(sito);

		//INSERIMENTO DI TANTE Note associate allo stesso Autore 
		List<Notes> listaNotes = new ArrayList<Notes>();
		Notes nota1 = new Notes();
		nota1.setNote("nota5");
		nota1.setAutore(autore);
		Notes nota2 = new Notes();
		nota2.setAutore(autore);
		nota2.setNote("nota6");
		listaNotes.add(nota1);
		listaNotes.add(nota2);
		
		autore.setElencoNotesScritte(listaNotes);
		service.createAutore(autore);
		
		System.out.println("Autore ISNERITO, Sito INSERITO, NOTES INSERITE");
		
/* TEST per Visualizzare TUTTI gli ID Autori */
		System.out.println("Elenco Autori:");
		List<Autori> elenco = (List<Autori>) service.elencoAutori();
		for (Autori item : elenco) {
			System.out.println("id_autore: "+item.getId_autore());
		}
		
	}
	
}
