import java.util.ArrayList;
import java.util.Scanner;

public class Jukebox {
	private ArrayList<Song> songlist = new ArrayList<Song>();
	private ArrayList<Album> albumlist = new ArrayList<Album>();
// data below for input of array lists created above
	
	Song aSong = new Song("Bad", "Micheal Jackson", 1987, (float) 04.07);
	Song bSong = new Song("Baby", "Justin Bieber", 2008, (float) 03.36);
	Song cSong = new Song("Hello", "Adele", 2015,
			(float) 05.57);
	Song dSong = new Song("NO", "Meghan Trainer", 2016,
			(float) 03.23);
	Song eSong = new Song("Superstition", "Stevie Wonder", 1972, (float) 04.28);

	Album aAlbum = new Album("Bad", 1987);
	Album bAlbum = new Album("Baby", 2008);
	Album cAlbum = new Album("25", 2015);
	Album dAlbum = new Album("Funky", 2016);
	Album eAlbum = new Album("Smooth Soul", 1988);

	public static void main(String[] args) {
	
		Jukebox Jukebox = new Jukebox(); 
	}
		
// below is the addition of data for the array lists in the jukebox
	public Jukebox() {
		songlist.add(aSong);
		songlist.add(bSong);
		songlist.add(cSong);
		songlist.add(dSong);
		songlist.add(eSong);
		albumlist.add(aAlbum);
		albumlist.add(bAlbum);
		albumlist.add(cAlbum);
		albumlist.add(dAlbum);
		albumlist.add(eAlbum);
		userChoice();
		

	}
//this whole method lets the user dictate wether they want to play an album or a song
	public void userChoice() {
		System.out.println("Welcome to Jukebox Pro!");
		System.out.println("Select to View by Album or Song");
		Scanner scan = new Scanner(System.in);
		String userInput = scan.next();
		if (userInput.equalsIgnoreCase("Album")) {
			for (int i = 0; i < albumlist.size(); i++) {
				System.out.println(i + 1 + " " + albumlist.get(i).title);
			}
// goes through the album choices from user input			

			System.out.println("What album would you like to listen to?");
			String userInputA = scan.next();
			
			if (userInputA.equalsIgnoreCase(aAlbum.title)) {
				System.out.println("Will now play " + aAlbum.title + " next");
			} else if (userInputA.equalsIgnoreCase(bAlbum.title)) {
				System.out.println("Will now play " + bAlbum.title + " next");
			} else if (userInputA.equalsIgnoreCase(cAlbum.title)) {
				System.out.println("Will now play " + cAlbum.title + " next");
			} else if (userInputA.equalsIgnoreCase(dAlbum.title)) {
				System.out.println("Will now play " + dAlbum.title + " next");
			} else {
				System.out.println("Will now play " + eAlbum.title + " next");
			}
 // goes through song choices for user input  
		} else {
			{
				for (int j = 0; j < songlist.size(); j++) {
					System.out.println(j + 1 + " " + songlist.get(j).name
							+ " by " + songlist.get(j).artist);
				}
				System.out.println("What album would you like to listen to?");
				String userInputB = scan.next();
				if (userInputB.equals(aSong.name)) {
					System.out.println("Will now play " + aSong.name + " next");
				} else if (userInputB.equalsIgnoreCase(bSong.name)) {
					System.out.println("Will now play " + bSong.name + " next");
				} else if (userInputB.equalsIgnoreCase(cSong.name)) {
					System.out.println("Will now play " + cSong.name + " next");
				} else if (userInputB.equalsIgnoreCase(dSong.name)) {
					System.out.println("Will now play " + dSong.name + " next");
				} else {
					System.out.println("Will now play " + eSong.name + " next");
				}
			}
			scan.close();
		}
	}
}

