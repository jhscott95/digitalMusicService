/*
* AUTHOR: Jacob Scott
* FILE: Song.java
* ASSIGNMENT: Programming Assignment 4
* COURSE: CSc 210; Fall 2020
* PURPOSE: This class creates a song and initializes the title,
* artist, and number of plays. It also can "play" a song and 
* increments the count.
*
* USAGE: 
* Initialize the class with a title and artist of a song and the
* new keyword and it will automatically keep track of plays.
* 
*/

public class Song {

	private String title;
	private String artist;
	private int plays;
	
	/*
     * Purpose: The method is the constructor and relies on the
     * passed in information about the title and artist of a song.
     * 
     * @param: title, The title of a song.
     * @param: artist, The artist of a song.
     * 
     * @return: None.
     */
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
		this.plays = 0;
	}
	
	/*
     * Purpose: The method returns the title aspect of the
     * song object.
     * 
     * @return: The title string.
     */
	public String getTitle() {
		return title;
	}
	
	/*
     * Purpose: The method returns the artist aspect of the
     * song object.
     * 
     * @return: The artist string.
     */
	public String getArtist() {
		return artist;
	}
	
	/*
     * Purpose: The method returns the number of plays of the
     * song object.
     * 
     * @return: The plays int.
     */
	public int getTimesPlayed() {
		return plays;
	}
	
	/*
     * Purpose: The method plays a song by printing a description and
     * increments the number of plays.
     * 
     * @return: None.
     */
	public void play() {
		System.out.println(this);
		this.plays++;
	}
	
	/*
     * Purpose: The method returns a readable string of the object's information.
     * 
     * @return: The string representation of the object info.
     */
	public String toString() {
		return title + " by " + artist + ", " + plays + " play(s)";
	}
}
