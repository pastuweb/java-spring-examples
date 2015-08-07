package net.appuntivari.struts2.service;

import java.util.List;

import net.appuntivari.struts2.dto.Utente;

public interface HibernateService {

	//tabella Utente
	public void createUtente(Utente utente);
	public void deleteUtente(Utente utente);
	public void updateUtente(Utente utente);
	public Utente getUtente(String username);
	public List<Utente> getUtenti();
	
	
	
}
