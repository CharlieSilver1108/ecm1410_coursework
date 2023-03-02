package socialmedia;

/**
 * Thrown when attempting to use an account ID that does not exit in the system.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public class AccountIDNotRecognisedException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public AccountIDNotRecognisedException() {
		// do nothing
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public AccountIDNotRecognisedException(String message) {
		super(message);
	}

}
