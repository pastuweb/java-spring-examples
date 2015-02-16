package net.appuntivari.spring.hibernate.dto;

public class Siti{

	private Integer id_sito;
	private String dominio;
	private String tipologia;
	
	public Integer getId_sito() {
		return id_sito;
	}
	public void setId_sito(Integer id_sito) {
		this.id_sito = id_sito;
	}
	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	
}
