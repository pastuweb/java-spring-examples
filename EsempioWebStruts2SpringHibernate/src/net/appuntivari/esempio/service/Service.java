package net.appuntivari.esempio.service;

import java.util.List;

import net.appuntivari.esempio.model.Siti;




public interface Service {

	
	public void createSito(Siti autore);
	public List<Siti> getSiti();
}
