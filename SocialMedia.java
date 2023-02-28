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

	ArrayList<Integer> accountIDs = new ArrayList<Integer>();
	ArrayList<String> handles = new ArrayList<String>();

	public class Account{
		//attributes
		public int ID;
		public String handle;
		public String description;

		//constructors
		public Account(String handle){
			this.ID = createAccountID();
			this.handle = handle;
		}

		public Account(String handle, String description){
			this.ID = createAccountID();
			this.handle = handle;
			this.description = description;
		}

		//methods
		public int createAccountID(){
			double accountID = (Math.floor(Math.random() * 90000) + 10000);
			int intAccountID = (int) accountID;
			for (int id : accountIDs) {
				if (intAccountID == id){
					intAccountID = createAccountID();
				}
			}
			accountIDs.add(intAccountID);
			return intAccountID;
		}

		public int getID(){
			return (this.ID);
		}

		public String getHandle(){
			return (this.handle);
		}

		public String getDescription(){
			return (this.description);
		}
	}

	ArrayList<Account> accounts = new ArrayList<>();

	
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
				accounts.get(i).handle = newHandle;
			}
		}

	}

	@Override
	public void updateAccountDescription(String handle, String description) throws HandleNotRecognisedException {
		for (int i = 0; i<accounts.size(); i++){
			if (accounts.get(i).getHandle() == handle){
				accounts.get(i).description = description;
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
		// TODO Auto-generated method stub
		return 0;
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
