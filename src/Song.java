public class Song {
	String name;
	String artist;
	int year;
	float length;
// constructor for my song class
	public Song(String name, String artist, int year, float length) {
		this.name = name;
		this.artist = artist;
		this.year = year;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
}