package net.appuntivari.wicketapp.service;

import java.util.List;

import net.appuntivari.wicketapp.dto.Utente;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;


public class JdbcServiceImpl implements JdbcService{
	
	public static Log log = LogFactory.getLog(JdbcServiceImpl.class);

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
