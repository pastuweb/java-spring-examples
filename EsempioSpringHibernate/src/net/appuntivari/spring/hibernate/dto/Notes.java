package net.appuntivari.spring.hibernate.dto;


public class Notes{

	private Integer id_note;
	private String note;
	private Autori autore;
	
	public Integer getId_note() {
		return id_note;
	}
	public void setId_note(Integer id_note) {
		this.id_note = id_note;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Autori getAutore() {
		return autore;
	}
	public void setAutore(Autori autore) {
		this.autore = autore;
	}

}
