package org.openmrs.module.messaging.framework;

/**
 * This is an interface for objects that wish to receive notifications about the
 * status of messages that have been sent. Registration to receive these
 * notifications should be done by using the
 * {@link MessagingService#sendMessage(Message, Address, MessageDelegate)} or
 * {@link MessagingService#sendMessages(java.util.Map, MessageDelegate)}
 * methods.
 * 
 */
public interface MessageDelegate {

	/**
	 * This method will be called when the message is sent successfully
	 * 
	 * @param message The message that was sent
	 */
	public void messageSentSuccessfully(Message message);

	/**
	 * This method will be called if the message was unable to be delivered
	 * 
	 * @param message The undelivered message
	 * @param error The reason it was undeliverable
	 */
	// TODO: figure out what we really want this error to be, whether that be an
	// exception or an enum or a string, or whatever
	public void messageDeliveryFailedWithError(Message message, Exception error);

	/**
	 * This method will be called when a response is recieved for a message that
	 * was sent. Since determining which message is a response to which is
	 * sometimes a tricky process, this callback may not be 100% accurate or may
	 * not even be implemented by certain messaging frameworks
	 * 
	 * @param sentMessage The original message that was sent 
	 * @param reply The reply to the message
	 */
	public void messageRepliedTo(Message sentMessage, Message reply);

}