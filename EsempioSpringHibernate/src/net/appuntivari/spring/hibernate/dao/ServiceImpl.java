package net.appuntivari.spring.hibernate.dao;


import java.util.List;

import net.appuntivari.spring.hibernate.dto.Autori;
import net.appuntivari.spring.hibernate.dto.Notes;
import net.appuntivari.spring.hibernate.dto.Siti;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.HibernateOperations;



public class ServiceImpl implements Service{

	public static Log log = LogFactory.getLog("Service");
	protected HibernateOperations hibernateTemplate;
	public HibernateOperations getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateOperations hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void createAutore(Autori autore) {		
		hibernateTemplate.saveOrUpdate(autore);
	}

	@Override
	public void createSito(Siti sito) {
		hibernateTemplate.save(sito);	
	}

	@Override
	public void createNote(Notes nota) {
		hibernateTemplate.save(nota);			
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Autori> elencoAutori() {
		return (List<Autori>) hibernateTemplate.find("from Autori");		
	}


	
}
