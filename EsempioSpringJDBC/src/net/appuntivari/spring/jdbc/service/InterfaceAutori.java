package net.appuntivari.spring.jdbc.service;

import java.util.List;

import net.appuntivari.spring.jdbc.dto.Autori;


public interface InterfaceAutori {

	public List<Autori> getElencoAutori();
	public void insertNuovoAutore(Autori autore);
	
}
