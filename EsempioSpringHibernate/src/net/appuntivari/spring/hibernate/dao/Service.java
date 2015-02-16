package net.appuntivari.spring.hibernate.dao;

import java.util.List;

import net.appuntivari.spring.hibernate.dto.Autori;
import net.appuntivari.spring.hibernate.dto.Notes;
import net.appuntivari.spring.hibernate.dto.Siti;



public interface Service {

	
	public void createAutore(Autori autore);
	public void createSito(Siti sito);
	public void createNote(Notes nota);
	
	
	public List<Autori> elencoAutori();
	
}
