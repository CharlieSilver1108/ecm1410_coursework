package socialmedia;

public class CommentPost extends Post{
    private int parentPostID;
    private String parentPostType;

    public CommentPost(int accountID, String accountHandle, String contents, int parentPostID, String parentPostType){
        super(accountID, accountHandle, contents);
        this.parentPostID = parentPostID;
    }

    public int getParentPostID(){
        return parentPostID;
    }

    public String getParentPostType(){
        return parentPostType;
    }
    
    
}
