import java.util.ArrayList;
import java.util.List;

/*
* AUTHOR: Jacob Scott
* FILE: UseCollection.java
* ASSIGNMENT: Programming Assignment 4
* COURSE: CSc 210; Fall 2020
* PURPOSE: This class creates an ArrayList which stores the information of every user created. Also
* contains a method which will check the login info given to every user in the collection.
*
* USAGE: 
* Initialize the class with no parameters and add users with the .addUsers() method.
* 
*/

public class UserCollection {
	
	private List<User> users;
	
	/*
     * Purpose: The method is the constructor and creates a new list of users which is
     * initially empty.
     * 
     * @return: None.
     */
	public UserCollection() {
		this.users = new ArrayList<User>();
	}
	
	/*
     * Purpose: The method determines if a user exists in the user collection by searching through
     * the list and comparing the names associated with the account.
     * 
     * @param: username, The name that will be used to search for in the collection.
     * 
     * @return: A boolean either true if there is a match, otherwise false.
     */
	public boolean userExists(String username) {
		for (User u: users) {
			if (u.getName() == username) {
				return true;
			}
		} 
		return false;
	}
	
	/*
     * Purpose: The method determines if a user exists in the user collection by searching through
     * the list and comparing the names associated with the account.
     * 
     * @param: username, The name that will be used to match with a username in the collection.
     * @param: password, The name that will be used to match with a password in the collection
     * 
     * @return: Either the user object if there is a match, otherwise null.
     */
	public User login(String username, String password) {
		for (User u: users) {
			if (u.getName().equals(username) && u.attemptLogin(password)) {
				return u;
			}
		}
		return null;
	}
	
	/*
     * Purpose: The method adds a user to the collection.
     * 
     * @param: add, The user object which is being added to the collection.
     * 
     * @return: None.
     */
	public void addUser(User add) {
		users.add(add);
	}
	
	/*
     * Purpose: The method returns a readable string of the user collection's information.
     * 
     * @return: The string representation of the object info.
     */
	public String toString() {
		return users.toString();
	}

}
