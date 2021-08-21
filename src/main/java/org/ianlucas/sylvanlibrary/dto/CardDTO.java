package org.ianlucas.sylvanlibrary.dto;

import java.io.Serializable;

public class CardDTO implements Serializable{

	/**
	 * This DTO holds a card that matches the search criteria of used by 
	 * archetype specified by the user in the search.jsp
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String archetype;
	private String picture;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArchetype() {
		return archetype;
	}
	public void setArchetype(String archetype) {
		this.archetype = archetype;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
