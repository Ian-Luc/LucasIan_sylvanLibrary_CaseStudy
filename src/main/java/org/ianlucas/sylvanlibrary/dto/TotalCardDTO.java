package org.ianlucas.sylvanlibrary.dto;

import java.io.Serializable;

public class TotalCardDTO implements Serializable{

	/**
	 * Used by the ContentRepository to store the amount of cards used by a certain archetype
	 */
	private static final long serialVersionUID = 1L;

	private String card;
	private int quantity;
	
	public TotalCardDTO(String card, int quantity) {
		this.card = card;
		this.quantity = quantity;
	}
	
	public TotalCardDTO() {	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
