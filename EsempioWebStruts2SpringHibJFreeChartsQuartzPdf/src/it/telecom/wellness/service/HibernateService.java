package it.telecom.wellness.service;

import it.telecom.wellness.dto.Utente;

import java.util.List;

public interface HibernateService {

	//tabella Utente
	public void createUtente(Utente utente);
	public void deleteUtente(Utente utente);
	public void updateUtente(Utente utente);
	public Utente getUtente(String username);
	public List<Utente> getUtenti();
	
	
	
}
