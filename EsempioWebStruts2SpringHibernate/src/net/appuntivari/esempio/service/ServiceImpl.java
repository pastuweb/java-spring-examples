package net.appuntivari.esempio.service;

import java.util.List;


import net.appuntivari.esempio.model.Siti;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class ServiceImpl implements Service{

	public static Log log = LogFactory.getLog("Service");
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	  }
	
	
	@Override
	public void createSito(Siti sito) {	
		
		Session session = null;
	    session = sessionFactory.openSession();
	    try{
	    	session.save(sito);	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Siti> getSiti() {
		
		Session session = null;
	    session = sessionFactory.openSession();
	    List<Siti> listaSiti = null;
	    try{
	    	listaSiti = (List<Siti>) session.createQuery("from Siti").list();
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
		return listaSiti;
	}

}
