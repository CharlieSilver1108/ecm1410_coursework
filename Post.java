package socialmedia;

import java.util.ArrayList;


public class Post{

    //attributes
    private int ID;
    private int accountID;
    private String accountHandle;
    private String contents;
    private static int numberOfPosts = 0;

    private ArrayList<CommentPost> comments = new ArrayList<>();
    private ArrayList<EndorsePost> endorsements = new ArrayList<>();

    //constructors
    public Post(int accountID, String accountHandle, String contents){
        this.ID = ++numberOfPosts;
        if(validateAccountID(accountID)){
            this.accountID = accountID;
        }else{
            throw new AccountIDNotRecognisedException("AccountID is invalid")
        }
        this.accountHandle = accountHandle;
        if(contents.length() <= 100){
            this.contents = contents;
        }else{
            throw new InvalidPostException("Post contains too many characters")
        }
            
    }

    //methods
    public int getID(){
        return this.ID;
    }

    public int getAccountID(){
        return this.accountID;
    }

    public String getAccountHandle(){
        return this.accountHandle;
    }

    public String getContents(){
        return this.contents;
    }

    public void setContents(String contents){
        this.contents = contents;
    }
    
    public boolean validateAccountID(int accountID){
        //check if accountID exists in accounts id arraylist
        arrayList<Integer> accountIDs = account.getAccountIDs;
        for (int id : accountIDs) {
            if (intAccountID == id){
                intAccountID = createAccountID();
            }
        }
    }

    public void addComment(CommentPost Post){
        comments.add(Post);
    }

    public void addEndorsement(EndorsePost Post){
        endorsements.add(Post);
    }
}
