package socialmedia;

/**
 * Thrown when attempting to create a post which the message is empty or has
 * more characters than the system's limit.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public class InvalidPostException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public InvalidPostException() {
		// do nothing
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public InvalidPostException(String message) {
		super(message);
	}

}
