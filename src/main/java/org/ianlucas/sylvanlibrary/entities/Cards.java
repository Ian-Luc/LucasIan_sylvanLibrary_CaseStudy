package org.ianlucas.sylvanlibrary.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
public class Cards {
	
	@Id
	@Column(name = "card_name")
	private String name;
	@Column(name = "card_type")
	private String type;
	@Column(name = "card_color")
	private String color;
	@Column(name = "card_cmc")
	private String cost;
	@Column(name = "img_source")
	private String imgSource;
	
	public Cards() { }
	
	public Cards(String name, String type, String color, String cost, String imgSource) {
		this.name = name;
		this.type = type;
		this.color = color;
		this.cost = cost;
		this.imgSource = imgSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getImgSource() {
		return imgSource;
	}

	public void setImgSource(String imgSource) {
		this.imgSource = imgSource;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((imgSource == null) ? 0 : imgSource.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Cards other = (Cards) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (imgSource == null) {
			if (other.imgSource != null)
				return false;
		} else if (!imgSource.equals(other.imgSource))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
