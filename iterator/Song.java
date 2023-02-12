/**
 * A representation of a song
 * @author Daniel Chavez
 */
public class Song {
  String name;
  String artist;
  double length;
  Genre genre;

  /**
   * Constructs a new song object
   * @param name
   * @param artist
   * @param length
   * @param genre
   */
  public Song(String name, String artist, double length, Genre genre) {
    this.name = name;
    this.artist = artist;
    this.length = length;
    this.genre = genre;
  }

  /**
   * A string representation of all the subcomponents in a song
   * @return A string representtaion of all the subcomponents in a song
   */
  public String toString() {
    return
      "-  " + this.name + " by " + this.artist + " category: " + this.genre
      + " length: " + this.length + " min";
  }
}