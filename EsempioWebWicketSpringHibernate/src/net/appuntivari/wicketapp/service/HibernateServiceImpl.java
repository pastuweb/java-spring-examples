package net.appuntivari.wicketapp.service;

import java.util.List;

import net.appuntivari.wicketapp.dto.Utente;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateServiceImpl implements HibernateService{

	public static Log log = LogFactory.getLog(HibernateServiceImpl.class);
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	  }
	
	
	@Override
	public void createUtente(Utente utente) {	
		
		Session session = null;
	    session = sessionFactory.openSession();
	    try{
	    	session.save(utente);	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Utente> getUtenti() {
		
		Session session = null;
	    session = sessionFactory.openSession();
	    List<Utente> listaUtenti = null;
	    try{
	    	listaUtenti = (List<Utente>) session.createQuery("from Utente").list();
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
		return listaUtenti;
	}


	@Override
	public void deleteUtente(Utente utente) {

		Session session = null;
	    session = sessionFactory.openSession();
	    try{
	    	session.delete(utente);	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	    
	}


	@Override
	public void updateUtente(Utente utente) {
		
		Session session = null;
	    session = sessionFactory.openSession();
	    try{
	    	session.update(utente);	
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
	}


	@Override
	public Utente getUtente(String username) {
				
		log.info("getUtente "+username);
		Session session = null;
	    session = sessionFactory.openSession();
	    Utente utente = null;
	    try{
	    	Query q = session.createQuery("from Utente as u where u.username = :username");
	    	q.setString("username", username);
	    	
	    	/* oppure
	    	 * Criteria criteria = session.createCriteria(Utente.class);
	    	 * criteria.add( Restrictions.like("username", username) );
	    	 * utente = (Utente)criteria.uniqueResult();
	    	 */

	    	utente = (Utente)q.list().get(0);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
		return utente;
	}

}
