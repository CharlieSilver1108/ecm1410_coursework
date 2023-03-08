package socialmedia;

/**
 * Thrown when attempting to assign an account handle empty or having more than
 * the system limit of characters. A handle must be a single word, i.e., no
 * white spaces allowed.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public class InvalidHandleException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public InvalidHandleException() {
		// do nothing
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public InvalidHandleException(String message) {
		super(message);
	}

}
