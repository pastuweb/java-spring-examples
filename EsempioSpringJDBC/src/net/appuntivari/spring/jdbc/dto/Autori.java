package net.appuntivari.spring.jdbc.dto;

public class Autori {

	private Integer id_autore;
	private String nome;
	private String cognome;
	private Integer id_sito;
	
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
	public Integer getId_sito() {
		return id_sito;
	}
	public void setId_sito(Integer id_sito) {
		this.id_sito = id_sito;
	}
	
	
}