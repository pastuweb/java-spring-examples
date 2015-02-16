package net.appuntivari.esempio.actions;

import java.util.ArrayList;
import java.util.List;

import net.appuntivari.esempio.model.Siti;
import net.appuntivari.esempio.service.Service;
import net.appuntivari.esempio.service.ServiceImpl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class MyAction extends ActionSupport implements ModelDriven{

	
	private static final long serialVersionUID = 1L;

	public static Log log = LogFactory.getLog("Action");

	private Service dbService;
	public void setDbService(Service dbService) {
		this.dbService = dbService;
	}

	private Siti sito = new Siti();
	private List<Siti> listaSiti = new ArrayList<Siti>();
	
	public String doSaveSito(){
		
		log.info("Domino: "+sito.getDominio());
		log.info("Tipologia: "+sito.getTipologia());
		
		
		dbService.createSito(sito);
		
		
		listaSiti = dbService.getSiti();
		return SUCCESS;
	}
	
	@Override
	public String execute() throws Exception { /*default - NON USATO nell'esempio */
		listaSiti = dbService.getSiti();
		return SUCCESS;
	}

	public Siti getSito() {
		return sito;
	}

	public void setSito(Siti autore) {
		this.sito = sito;
	}

	public List<Siti> getListaSiti() {
		return listaSiti;
	}

	public void setListaSiti(List<Siti> listaSiti) {
		this.listaSiti = listaSiti;
	}


	@Override
	  public Siti getModel() {
	    return sito;
	  }


}
