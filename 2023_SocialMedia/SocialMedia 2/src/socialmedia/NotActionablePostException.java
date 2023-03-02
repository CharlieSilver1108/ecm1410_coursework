package socialmedia;

/**
 * Thrown when attempting to act upon an not-actionable post.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public class NotActionablePostException extends Exception {

	/**
	 * Constructs an instance of the exception with no message
	 */
	public NotActionablePostException() {
		// do nothing
	}

	/**
	 * Constructs an instance of the exception containing the message argument
	 * 
	 * @param message message containing details regarding the exception cause
	 */
	public NotActionablePostException(String message) {
		super(message);
	}

}
