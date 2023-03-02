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
		// TODO Auto-generated method stub
		return null;
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
		int postID = posts.get(j).getID();
		return postID;
	}

	@Override
	public int endorsePost(String handle, int id)
			throws HandleNotRecognisedException, PostIDNotRecognisedException, NotActionablePostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int commentPost(String handle, int id, String message) throws HandleNotRecognisedException,
			PostIDNotRecognisedException, NotActionablePostException, InvalidPostException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deletePost(int id) throws PostIDNotRecognisedException {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalEndorsmentPosts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCommentPosts() {
		// TODO Auto-generated method stub
		return 0;
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
