package net.appuntivari.wicketapp.service;

import java.util.List;

import net.appuntivari.wicketapp.dto.Utente;

public interface HibernateService {

	//tabella Utente
	public void createUtente(Utente utente);
	public void deleteUtente(Utente utente);
	public void updateUtente(Utente utente);
	public Utente getUtente(String username);
	public List<Utente> getUtenti();
	
	
	
}
