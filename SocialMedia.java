package socialmedia;

import java.io.IOException;
import java.util.ArrayList;

/**
 * BadSocialMedia is a minimally compiling, but non-functioning implementor of
 * the SocialMediaPlatform interface.
 * 
 * @author Diogo Pacheco
 * @version 1.0
 */
public class SocialMedia implements SocialMediaPlatform {


	ArrayList<Account> accounts = new ArrayList<>();
	ArrayList<Post> posts = new ArrayList<>();
	ArrayList<Post> allPosts = new ArrayList<>();
	ArrayList<EndorsePost> allEndorsements = new ArrayList<>();
	ArrayList<CommentPost> allComments = new ArrayList<>();

	
	@Override
	public int createAccount(String handle) throws IllegalHandleException, InvalidHandleException {
		accounts.add(new Account(handle));
		int i = accounts.size() - 1;
		int id = accounts.get(i).getID();
		return id;
	}

	@Override
	public int createAccount(String handle, String description) throws IllegalHandleException, InvalidHandleException {
		accounts.add(new Account(handle, description));
		int i = accounts.size() - 1;
		int id = accounts.get(i).getID();
		return id;
	}

	@Override
	public void removeAccount(int id) throws AccountIDNotRecognisedException {;
	for (int i = 0; i<accounts.size(); i++){
		if (accounts.get(i).getID() == id){
			accounts.remove(i);
			break;
		}
	}

	}

	@Override
	public void removeAccount(String handle) throws HandleNotRecognisedException {
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				accounts.remove(i);
				break;
			}
		}

	}

	@Override
	public void changeAccountHandle(String oldHandle, String newHandle)
			throws HandleNotRecognisedException, IllegalHandleException, InvalidHandleException {
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == oldHandle){
				accounts.get(i).setHandle(newHandle);
			}
		}

	}

	@Override
	public void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException {
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				accounts.get(i).setDescription(description);
			}
		}

	}

	@Override
	public String showAccount(String handle) throws HandleNotRecognisedException {
		int noOfPosts = 0;
		String ID = "";
		String description = "";
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				ID = Integer.toString(accounts.get(i).getID());
				description = accounts.get(i).getDescription();
			}
		}
		for (int i = 0; i<posts.size(); i++){
			if (posts.get(i).getAccountHandle() == handle){
				++noOfPosts;
			}
		}

		String strNoOfPosts = Integer.toString(noOfPosts);
		String information = String.format("ID: %a \nHandle: %b \nDescription: %c \nPost Count: %d", ID, handle, description, strNoOfPosts);

		return information;
	}

	@Override
	public int createPost(String handle, String message) throws HandleNotRecognisedException, InvalidPostException {
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				int accountID = accounts.get(i).getID();
				posts.add(new Post(accountID, handle, message));
				break;
			}
		}
				
		int j = posts.size() - 1;
		allPosts.add(posts.get(j));
		int postID = posts.get(j).getID();
		return postID;
	}

	@Override
	public int endorsePost(String handle, int id)
			throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
		int accountID = 0;
		String message = "";
		Post post;

		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				accountID = accounts.get(i).getID();
				break;
			}
		}

		for (int i = 0; i<posts.size(); i++){
			if (posts.get(i).getID() == id){
				message = posts.get(i).getContents();
				post = posts.get(i);
				String contents = String.format("EP@%a: %b", handle, message);
				allEndorsements.add(new EndorsePost(accountID, handle, contents, id));
				int j = allEndorsements.size() - 1;
				int endorsementID = allEndorsements.get(j).getID();
				post.addEndorsement(allEndorsements.get(j));
				return endorsementID;
			}
		}

		return 0;
	}

	@Override
	public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
			PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
		int accountID = 0;
		Post post;
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				accountID = accounts.get(i).getID();
				break;
			}
		}

		for (int i = 0; i<posts.size(); i++){
			if(allPosts.get(i).getID() == id){
				String type = allPosts.get(i).getClass().getName();
				post = allPosts.get(i);
				allComments.add(new CommentPost(accountID, handle, message, id, type));
				int j = allComments.size() - 1;
				int commentID = allComments.get(j).getID();
				allPosts.add(allComments.get(j));
				post.addComment(allComments.get(j));
				return commentID;
			}
		}

		return 0;
	}

	@Override
	public void deletePost(int id) throws PostIDNotRecognisedException {
		for (int i = 0; i<allPosts.size(); i++){
			if (allPosts.get(i).getID() == id){
				allPosts.remove(i);
				break;
			}
		}
		for (int i = 0; i<posts.size(); i++){
			if (posts.get(i).getID() == id){
				posts.remove(i);
				break;
			}
		}
		for (int i = 0; i<allComments.size(); i++){
			if (allComments.get(i).getID() == id){
				allComments.remove(i);
				break;
			}
		}
		for (int i = 0; i<allEndorsements.size(); i++){
			if (allEndorsements.get(i).getID() == id){
				allEndorsements.remove(i);
				break;
			}
		}

	}

	@Override
	public String showIndividualPost(int id) throws PostIDNotRecognisedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuilder showPostChildrenDetails(int id)
			throws PostIDNotRecognisedException, NotActionablePostException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNumberOfAccounts() {
		return accounts.size();
	}

	@Override
	public int getTotalOriginalPosts() {
		return posts.size();
	}

	@Override
	public int getTotalEndorsmentPosts() {
		return allEndorsements.size();
	}

	@Override
	public int getTotalCommentPosts() {
		return allComments.size();
	}

	@Override
	public int getMostEndorsedPost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMostEndorsedAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void erasePlatform() {
		// TODO Auto-generated method stub

	}

	@Override
	public void savePlatform(String filename) throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadPlatform(String filename) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

	}

}
