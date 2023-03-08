package socialmedia;

/**
 * SocialMediaPlatform interface. This interface is a more elaborated version of
 * the MiniSocialMediaPlatform. The no-argument constructor of a class
 * implementing this interface should initialise the SocialMediaPlatform as an
 * empty platform with no initial accounts nor posts within it. For Pair
 * submissions.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 *
 */
public interface SocialMediaPlatform extends MiniSocialMediaPlatform {

	// Account-related methods ****************************************

	/**
	 * The method creates an account in the platform with the given handle and
	 * description.
	 * <p>
	 * The state of this SocialMediaPlatform must be be unchanged if any exceptions
	 * are thrown.
	 * 
	 * @param handle      account's handle.
	 * @param description account's description.
	 * @throws IllegalHandleException if the handle already exists in the platform.
	 * @throws InvalidHandleException if the new handle is empty, has more than 30
	 *                                characters, or has white spaces.
	 * @return the ID of the created account.
	 */
	int createAccount(String handle, String description) throws IllegalHandleException, InvalidHandleException;

	/**
	 * The method removes the account with the corresponding handle from the
	 * platform. When an account is removed, all of their posts and likes should
	 * also be removed.
	 * <p>
	 * The state of this SocialMediaPlatform must be be unchanged if any exceptions
	 * are thrown.
	 * 
	 * @param handle account's handle.
	 * @throws HandleNotRecognisedException if the handle does not match to any
	 *                                      account in the system.
	 */
	void removeAccount(String handle) throws HandleNotRecognisedException;

	/**
	 * The method updates the description of the account with the respective handle.
	 * <p>
	 * The state of this SocialMediaPlatform must be be unchanged if any exceptions
	 * are thrown.
	 * 
	 * @param handle      handle to identify the account.
	 * @param description new text for description.
	 * @throws HandleNotRecognisedException if the handle does not match to any
	 *                                      account in the system.
	 */
	void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException;

	// End Post-related methods ****************************************

	// Analytics-related methods ****************************************

	/**
	 * This method returns the current total number of accounts present in the
	 * platform. Note, this is NOT the total number of accounts ever created since
	 * the current total should discount deletions.
	 * 
	 * @return the total number of accounts in the platform.
	 */
	int getNumberOfAccounts();

	/**
	 * This method returns the current total number of original posts (i.e.,
	 * disregarding endorsements and comments) present in the platform. Note, this
	 * is NOT the total number of posts ever created since the current total should
	 * discount deletions.
	 * 
	 * @return the total number of original posts in the platform.
	 */
	int getTotalOriginalPosts();

	/**
	 * This method returns the current total number of endorsement posts present in
	 * the platform. Note, this is NOT the total number of endorsements ever created
	 * since the current total should discount deletions.
	 * 
	 * @return the total number of endorsement posts in the platform.
	 */
	int getTotalEndorsmentPosts();

	/**
	 * This method returns the current total number of comments posts present in the
	 * platform. Note, this is NOT the total number of comments ever created since
	 * the current total should discount deletions.
	 * 
	 * @return the total number of comments posts in the platform.
	 */
	int getTotalCommentPosts();

	// End Management-related methods ****************************************

}