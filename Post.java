package socialmedia;

public class Post{

    //attributes
    private int ID;
    private int accountID;
    private String accountHandle;
    private String contents;
    private static int numberOfPosts = 0;
    //constructors
    public Post(int accountID, String accountHandle, String contents){
        this.ID = ++numberOfPosts;
        this.accountID = accountID;
        this.accountHandle = accountHandle;
        this.contents = contents;
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

}