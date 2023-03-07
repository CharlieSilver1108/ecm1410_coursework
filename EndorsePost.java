package socialmedia;

public class EndorsePost extends Post {
    private int parentPostID;


    public EndorsePost(int accountID, String accountHandle, String contents, int parentPostID){
        super(accountID, accountHandle, contents);
        this.parentPostID = parentPostID;
    }

    public int getParentPostID(){
        return parentPostID;
    }

}
