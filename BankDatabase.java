package javaapplication10;
import java.util.*; 

public class BankDatabase {
	
	private HashMap<String, String> userNames = new HashMap<>();
	
	public String checkUserName(String username) {
		if (this.userNames.containsKey(username)){
			return this.userNames.get(username);
		}
		else {
			return "NULL";
		}
	}
	
	public void addUser(String username, String fullName) {
		this.userNames.put(username, fullName);
	}

}
