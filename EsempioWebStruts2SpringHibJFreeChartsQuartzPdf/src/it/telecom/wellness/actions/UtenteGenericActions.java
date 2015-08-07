package it.telecom.wellness.actions;

import it.telecom.wellness.dto.Utente;
import it.telecom.wellness.service.HibernateService;
import it.telecom.wellness.service.JdbcService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UtenteGenericActions extends ActionSupport implements ModelDriven{

	
	private static final long serialVersionUID = 1L;
	public static Log log = LogFactory.getLog(UtenteGenericActions.class);

	private HibernateService hibernateService;
	public void setHibernateService(HibernateService hibernateService) {
		this.hibernateService = hibernateService;
	}
	private JdbcService jdbcService;
	public void setJdbcService(JdbcService jdbcService) {
		this.jdbcService = jdbcService;
	}

	private Utente utente = new Utente();
	private String user;
	
	public String doGetUtenteByUsername(){

		
		log.info("doGetUtenteByUsername user: " + user);
		utente = hibernateService.getUtente(user);

		return SUCCESS;
	}

	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
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
