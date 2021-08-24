package org.ianlucas.sylvanlibrary.dto;

import java.io.Serializable;

public class SearchDTO implements Serializable{

	/**
	 * This DTO holds a card that matches the search criteria of used by 
	 * archetype specified by the user in the search.jsp
	 */
	private static final long serialVersionUID = 1L;

	private String format;
	private String item;
	
	public SearchDTO(String format, String item) {
		this.format = format;
		this.item = item;
	}
	
	public SearchDTO() { }
	
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
