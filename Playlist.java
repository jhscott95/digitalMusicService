import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* AUTHOR: Jacob Scott
* FILE: Playlist.java
* ASSIGNMENT: Programming Assignment 4
* COURSE: CSc 210; Fall 2020
* PURPOSE: This class creates a playlist object which stores songs entered by a user.
*
* USAGE: 
* Initialize the class with a name and add songs with the addSong() method.
* 
*/

public class Playlist {
	
	private String name;
	private List<Song> songs;
	
	/*
     * Purpose: The method is the constructor and creates a playlist object with 
     * a name given.
     * 
     * @param: name, The name of the playlist.
     * 
     * @return: None.
     */
	public Playlist(String name) {
		this.name = name;
		this.songs = new ArrayList<Song>();
	}
	
	/*
     * Purpose: The method is the contructor and creates a playlist object with a 
     * name given as well as a list of songs to add.
     * 
     * @param: name, The name of the playlist.
     * @param: contents, A list of songs which are added to the inital playlist.
     * 
     * @return: None.
     */
	public Playlist(String name, List<Song> contents) {
		this.name = name;
		this.songs = contents;
	}
	
	/*
     * Purpose: The method returns the name of the playlist object.
     * 
     * @return: The name string.
     */
	public String getName() {
		return name;
	}
	
	/*
     * Purpose: The method checks adds a song object to the playlist.
     * 
     * @param: song, A song object.
     * 
     * @return: None.
     */
	public void addSong(Song song) {
		songs.add(song);
	}
	
	/*
     * Purpose: The method plays a playlist by name and calls the .play() method
     * on the song object which will increment the play counter.
     * 
     * @return: None.
     */
	public void play() {
		for (Song s: songs) {
			s.play();
		}
	}
	
	/*
     * Purpose: The method shuffles the songs in the playlist.
     * 
     * @return: None.
     */
	public void shuffle() {
		Collections.shuffle(songs);
	}
	
	/*
     * Purpose: The method checks if a song exists in a playlist and then removes
     * it.
     * 
     * @return: None.
     */
	public void removeSong(Song song) {
		if (songs.contains(song)) {
			songs.remove(song);
		}
	}
}
