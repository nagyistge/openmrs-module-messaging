package org.openmrs.module.messaging.domain.gateway.exception;

/**
 * The exception thrown when an attempt is made to create an 
 * incorrectly formatted Address.
 */
@SuppressWarnings("serial")
public class AddressFormattingException extends Exception {
	public AddressFormattingException(String message){
		super(message);
	}
}
