package socialmedia;

/**
 * Thrown when attempting to assign an account handle already in use in the
 * system.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public class IllegalHandleException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public IllegalHandleException() {
		// do nothing
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public IllegalHandleException(String message) {
		super(message);
	}

}
