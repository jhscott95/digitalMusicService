import java.util.ArrayList;
import java.util.List;

/*
* AUTHOR: Jacob Scott
* FILE: User.java
* ASSIGNMENT: Programming Assignment 4
* COURSE: CSc 210; Fall 2020
* PURPOSE: This class creates a user with name and password strings and also keeps track
* of saved playlists for each user.
*
* USAGE: 
* Initialize the class with a username and password and the new keyword.
* 
*/

public class User {

	private String name;
	private String password;
	private List<Playlist> playlists;
	
	/*
     * Purpose: The method is the constructor and creates a user object with 
     * a name given as well as a password. It will also initialize a list to store the
     * playlists in
     * 
     * @param: name, The name of the user.
     * @param: password, The password of the user.
     * 
     * @return: None.
     */
	public User(String name, String password) {
		this.name = name;
		this.password = password;
		this.playlists = new ArrayList<Playlist>();
	}
	
	/*
     * Purpose: The method returns the username of the user object.
     * 
     * @return: The username string.
     */
	public String getName() {
		return name;
	}
	
	/*
     * Purpose: The method determines if the password passed in matches the
     * stored password of the user instance.
     * 
     * @param: password, The password being used to validate the login.
     * 
     * @return: A boolean depending on whether the given password matches the
     * one associated with the user.
     */
	public boolean attemptLogin(String password) {
		if (password.equals(this.password)) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
     * Purpose: The method adds a playlist to a user account.
     * 
     * @param: newPlaylist, The playlist object being added to a user's 
     * playlists.
     * 
     * @return: None.
     */
	public void addPlaylist(Playlist newPlaylist) {
		playlists.add(newPlaylist);
	}
	
	/*
     * Purpose: The method returns all the saved playlists associated with
     * the user.
     * 
     * @return: The ArrayList containing the playlist objects.
     */
	public List<Playlist> getPlaylists() {
		return playlists;
	}
	
	/*
     * Purpose: The method selects a playlist if the name of that playlist
     * matches the name given. Also calls the .play() method on each song.
     * 
     * @param: name, The name which is used to match to a playlist name.
     * 
     * @return: None.
     */
	public void selectPlaylist(String name) {
		for (Playlist p: playlists) {
			if (p.getName().equals(name)) {
				p.play();
			}
		}
	}
	
	/*
     * Purpose: The method returns a readable string of the user's name and 
     * playlist information.
     * 
     * @return: The string representation of the object info.
     */
	public String toString() {
		return name + ", " + playlists.size() + " playlists";
	}

}
