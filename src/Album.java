import java.util.ArrayList;

public class Album {
	String title;
	int year;
// constructor for my class album
	public Album(String title, int year) {
		this.title = title;
		this.year = year;
	}
	private ArrayList<Album> albumlist = new ArrayList<Album>();
	
	Album aAlbum = new Album("Funky Soul", 1987);
	Album bAlbum = new Album("Pop Classics", 2012);
	
	public void addAblum () {
		albumlist.add(aAlbum);
		albumlist.add(bAlbum);
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
