package net.appuntivari.spring.hibernate.dto;

import java.util.List;

public class Autori {

	private Integer id_autore;
	private String nome;
	private String cognome;
	private Siti sito;
	private List<Notes> elencoNotesScritte;
	
	public Integer getId_autore() {
		return id_autore;
	}
	public void setId_autore(Integer id_autore) {
		this.id_autore = id_autore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public List<Notes> getElencoNotesScritte() {
		return elencoNotesScritte;
	}
	public void setElencoNotesScritte(List<Notes> elencoNotesScritte) {
		this.elencoNotesScritte = elencoNotesScritte;
	}
	public Siti getSito() {
		return sito;
	}
	public void setSito(Siti sito) {
		this.sito = sito;
	}
	
}