package org.ianlucas.sylvanlibrary.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deckarchetype")
public class DeckArchetype {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer archetypeId;
	@Column(name = "name")
	private String name;
	@Column(name = "type")
	private String speed;
	@Column(name = "color")
	private String color;
	
	public DeckArchetype() { }
	
	public DeckArchetype(String archetypeName, String deckSpeed, String color) {
		this.name = archetypeName;
		this.speed = deckSpeed;
		this.color = color;
	}

	public Integer getArchetypeId() {
		return archetypeId;
	}

	public void setArchetypeId(Integer archetypeId) {
		this.archetypeId = archetypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + archetypeId;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeckArchetype other = (DeckArchetype) obj;
		if (archetypeId != other.archetypeId)
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed == null) {
			if (other.speed != null)
				return false;
		} else if (!speed.equals(other.speed))
			return false;
		return true;
	}
}
