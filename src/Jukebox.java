import java.util.ArrayList;
import java.util.Scanner;

public class Jukebox {
	
	

	public static void main(String[] args) {
	
		Jukebox Collection = new Jukebox(); 
	}
	private ArrayList<Song> songlist = new ArrayList<Song>();
	private ArrayList<Album> albumlist = new ArrayList<Album>();
	public Song song = new Song(null, null, 0, 0);
	public Album album = new Album (null, 0, album, album); 
	public Playlist playlist = new Playlist (null, null, null); 
		
// below is the addition of data for the array lists in the jukebox
	public void Collection() {
		
		
		song.addSongs(); 
		album.addAlbum();
		playlist.songNames(); 
		userSearch();
	}
}
}

		

	public void userSearch() {
		System.out.println("Welcome to Jukebox Pro!");
		System.out.println("Search for the Song you would like to listen to");
		Scanner scan = new Scanner(System.in);
		String searchTerm = scan.next();
		
		for ()
		
		
		