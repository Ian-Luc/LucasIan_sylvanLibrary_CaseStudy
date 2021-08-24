package org.ianlucas.sylvanlibrary.dto;

import java.io.Serializable;

import javax.persistence.SqlResultSetMapping;

public class ArchetypeDTO implements Serializable{

	/**
	 * Encapsulates DeckCatalog data for the Front End
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String playerName;
	private String format;
	private String archetype;
	
	public ArchetypeDTO(String name, String playerName, String format, String archetype) {
		this.name = name;
		this.playerName = playerName;
		this.format = format;
		this.archetype = archetype;
	}
	
	public ArchetypeDTO() {	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getArchetype() {
		return archetype;
	}

	public void setArchetype(String archetype) {
		this.archetype = archetype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
