package net.appuntivari.spring.jdbc.service;

import java.util.List;

import net.appuntivari.spring.jdbc.dto.Notes;


public interface InterfaceNotes {

	public List<Notes> getElencoNotes();
	public List<Notes> getElencoNotesByChiave(String chiave);
	public List<Object[]> getElencoNotesByAutore(String nomeAutore);
	public List<Object[]> getElencoNoteWithJoins();
	public void insertNuovaNota(Notes nota);
	
}
