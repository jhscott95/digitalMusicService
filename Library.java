import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
* AUTHOR: Jacob Scott
* FILE: Library.java
* ASSIGNMENT: Programming Assignment 4
* COURSE: CSc 210; Fall 2020
* PURPOSE: This class creates an ArrayList which stores every song object.
*
* USAGE: 
* Initialize the class with no parameters and add songs by passing in a song object
* using the .addSong() method. Can also remove songs by song title using removeSong()
* 
*/

public class Library {
	
	private List<Song> songs;
	
	/*
     * Purpose: The method is the constructor and creates a library instance.
     * 
     * @return: None.
     */
	public Library() {
		songs = new ArrayList<Song>();
	}
	
	/*
     * Purpose: The method checks through a library of songs and sees if a song 
     * exists within that library by title.
     * 
     * @param: title, The title of a song.
     * 
     * @return: A song object if found in the library.
     */
	public Song getSong(String title) {
		for (Song song: songs) {
			if (title.equals(song.getTitle())) {
				return song;
			}
		}
		return null;
	}
	
	/*
     * Purpose: The method returns every song in the library.
     * 
     * @return: The entire library of songs.
     */
	public List<Song> getAllSongs(){
		return songs;
	}
	
	/*
     * Purpose: The method checks adds a song object to the library.
     * 
     * @param: song, A song object.
     * 
     * @return: None.
     */
	public void addSong(Song song) {
		songs.add(song);
	}
	
	/*
     * Purpose: The method checks if a song exists within the library and then
     * removes it if it has the same title as the given song object.
     * 
     * @param: song, A song object.
     * 
     * @return: None.
     */
	public void removeSong (Song song) {
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getTitle() == song.getTitle()) {
				songs.remove(i);
			}
		}
	}
	
	/*
     * Purpose: The method returns a readable string of the library's information
     * after sorting it alphabetically.
     * 
     * @return: The string representation of the object info.
     */
	public String toString() {
		Collections.sort(songs, Comparator.comparing(Song::getTitle));
		for (Song s: songs) {
			System.out.println(s.toString());
		}
		return "";
	}
}
