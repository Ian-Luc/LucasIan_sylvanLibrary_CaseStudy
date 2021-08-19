package org.ianlucas.sylvanlibrary.exceptions;

public class NoDeckFoundException extends Exception{
	/**
	 * This exception is for when a user tries to input a card to a deck that doesn't exist
	 */
	private static final long serialVersionUID = -8937645650274175604L;
	
	public NoDeckFoundException(String errorMessage) {
		super(errorMessage);
	}

}
