package net.appuntivari.spring.jdbc.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import net.appuntivari.spring.jdbc.dto.Autori;
import net.appuntivari.spring.jdbc.dto.Notes;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;




public class Service implements InterfaceNotes, InterfaceAutori {
	
	public static Log log = LogFactory.getLog("Service");
	
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

/* Interfaccia Notes */
	
	@SuppressWarnings("unchecked")
	public List<Notes> getElencoNotes() {
		
		List<Notes> listaNotes = jdbcTemplate.query(
				"SELECT * FROM notes", 
				new RowMapper(){
					public Object mapRow(ResultSet rs, int arg1) 
							throws SQLException {
						Notes nota = new Notes();
						nota.setId_note(rs.getInt("id_note"));
						nota.setNote(rs.getString("note"));
						nota.setId_autore(rs.getInt("id_autore"));
						return nota;
					}
				});
		
		return listaNotes;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Notes> getElencoNotesByChiave(String chiave){
		List<Notes> listaNotesByKey = jdbcTemplate.query(
				"SELECT * FROM notes WHERE note LIKE ?", new Object[]{ new String("%"+chiave+"%")}, 
				new RowMapper(){
					public Object mapRow(ResultSet rs, int arg1) 
							throws SQLException {
						Notes nota = new Notes();
						nota.setId_note(rs.getInt("id_note"));
						nota.setNote(rs.getString("note"));
						nota.setId_autore(rs.getInt("id_autore"));
						return nota;
					}
				});
		return listaNotesByKey;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getElencoNotesByAutore(String nomeAutore){
		List<Object[]> listaNotesByNomeAutore = jdbcTemplate.query(
				"SELECT note, nome, cognome FROM notes, autori WHERE notes.id_autore=autori.id_autore and nome LIKE ?", new Object[]{ new String("%"+nomeAutore+"%")}, 
				new RowMapper(){
					public Object mapRow(ResultSet rs, int arg1) 
							throws SQLException {
						Object[] nota = new Object[3];
						nota[0] = rs.getString("note");
						nota[1] = rs.getString("nome");
						nota[2] = rs.getString("cognome");
						return nota;
					}
				});
		return listaNotesByNomeAutore;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getElencoNoteWithJoins(){
		List<Object[]> listaNotesWithJoins = jdbcTemplate.query(
				"SELECT note, nome, cognome, dominio FROM notes, autori, siti WHERE notes.id_autore=autori.id_autore and autori.id_sito=siti.id_sito ", 
				new RowMapper(){
					public Object mapRow(ResultSet rs, int arg1) 
							throws SQLException {
						Object[] nota = new Object[4];
						nota[0] = rs.getString("note");
						nota[1] = rs.getString("nome");
						nota[2] = rs.getString("cognome");
						nota[3] = rs.getString("dominio");
						return nota;
					}
				});
		return listaNotesWithJoins;
	}
	
	
	public void insertNuovaNota(Notes nota){
		 jdbcTemplate.update("INSERT INTO Notes(note,id_autore) VALUES(?,?) ", new Object[]{nota.getNote(),nota.getId_autore()}); 
		 log.info("Nuova NOTA inserita");
	}
	
	
/* Interfaccia Autori */
	

	@SuppressWarnings("unchecked")
	public List<Autori> getElencoAutori(){
		
		List<Autori> listaAutori = jdbcTemplate.query(
				"SELECT id_autore, nome, cognome FROM autori", 
				new RowMapper(){
					public Object mapRow(ResultSet rs, int arg1) 
							throws SQLException {
						Autori autore = new Autori();
						autore.setId_autore(rs.getInt("id_autore"));
						autore.setNome(rs.getString("nome"));
						autore.setCognome(rs.getString("cognome"));
						return autore;
					}
				});
		
		return listaAutori;
	}
	public void insertNuovoAutore(Autori autore){
		jdbcTemplate.update("INSERT INTO Autori(nome,cognome,id_sito) VALUES(?,?,?) ", new Object[]{autore.getNome(),autore.getCognome(), autore.getId_sito()}); 
		 log.info("Nuovo AUTORE inserito");
	}
	
	
	
}
