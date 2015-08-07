package it.telecom.wellness.actions;

import java.util.ArrayList;
import java.util.List;

import it.telecom.wellness.dto.Utente;
import it.telecom.wellness.service.HibernateService;
import it.telecom.wellness.service.JdbcService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UtenteCRUDActions extends ActionSupport implements ModelDriven{

	private static final long serialVersionUID = 1L;
	public static Log log = LogFactory.getLog(UtenteCRUDActions.class);

	private HibernateService hibernateService;
	public void setHibernateService(HibernateService hibernateService) {
		this.hibernateService = hibernateService;
	}
	private JdbcService jdbcService;
	public void setJdbcService(JdbcService jdbcService) {
		this.jdbcService = jdbcService;
	}

	private Utente utente = new Utente();
	private List<Utente> listaUtenti = new ArrayList<Utente>();
	
	public String doCreateUtente(){
		
		log.info("Nome: "+utente.getNome());
		log.info("Cognome: "+utente.getCognome());

		hibernateService.createUtente(utente);

		listaUtenti = hibernateService.getUtenti();
		return SUCCESS;
	}
	public String doDeleteUtente(){
			
			log.info("Nome: "+utente.getNome());
			log.info("Cognome: "+utente.getCognome());
	
			hibernateService.deleteUtente(utente);
	
			listaUtenti = hibernateService.getUtenti();
			return SUCCESS;
		}
	public String doUpdateUtente(){
		
		log.info("Nome: "+utente.getNome());
		log.info("Cognome: "+utente.getCognome());
	
		hibernateService.updateUtente(utente);
	
		listaUtenti = hibernateService.getUtenti();
		return SUCCESS;
	}

	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public List<Utente> getListaUtenti() {
		return listaUtenti;
	}
	public void setListaUtenti(List<Utente> listaUtenti) {
		this.listaUtenti = listaUtenti;
	}

	
	
	
	
	
	
	
	@Override
	public String execute() throws Exception { /*default*/
		log.info("execute()");
		return SUCCESS;
	}
	@Override
	public Utente getModel() {
		return utente;
	}


}
