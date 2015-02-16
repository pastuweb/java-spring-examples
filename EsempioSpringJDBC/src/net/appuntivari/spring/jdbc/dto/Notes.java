package net.appuntivari.spring.jdbc.dto;

public class Notes {

	private Integer id_note;
	private String note;
	private Integer id_autore;
	
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
	public Integer getId_autore() {
		return id_autore;
	}
	public void setId_autore(Integer id_autore) {
		this.id_autore = id_autore;
	}
	
	
}
