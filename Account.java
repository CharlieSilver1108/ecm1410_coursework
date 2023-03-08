package socialmedia;

import java.util.ArrayList;

public class Account {
        ArrayList<Integer> accountIDs = new ArrayList<Integer>();
	    ArrayList<String> handles = new ArrayList<String>();
    	
        //attributes
		private int ID;
		private String handle;
		private String description;

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
	
		public arrayList getAccountIDs(){
			return (accountIDs);
		}

		public String getHandle(){
			return (this.handle);
		}

		public String getDescription(){
			return (this.description);
		}

        public void setHandle(String handle){
            this.handle = handle;
        }

        public void setDescription(String description){
            this.description = description;
        }
}
