package net.appuntivari.wicketapp.init;



import java.util.List;
import net.appuntivari.wicketapp.dto.Utente;
import net.appuntivari.wicketapp.service.HibernateService;
import net.appuntivari.wicketapp.service.JdbcService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public class WicketServiceImpl implements WicketService {
	
	public static Log log = LogFactory.getLog(WicketServiceImpl.class);

	
	private HibernateService hibernateService;
	public void setHibernateService(HibernateService hibernateService) {
		this.hibernateService = hibernateService;
	}
	private JdbcService jdbcService;
	public void setJdbcService(JdbcService jdbcService) {
		this.jdbcService = jdbcService;
	}
	
	@Override
	public String getHomeHeader() {
		return new String("Wicket Home Page");
	}

	@Override
	public String getUtenti() {
		
		String usernames = new String("");

		List<Utente> list = hibernateService.getUtenti();
		for (Utente utente : list) {
			usernames = usernames + utente.getUsername() + ",";
		}
		usernames = usernames.substring(0, usernames.length()-1);
		log.info(usernames);
		
		return "Usernames on DB: "+usernames;
	}

}
