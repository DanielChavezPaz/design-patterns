/**
 * A representation of a song
 * @author Daniel Chavez
 */
public class Song {
  private String title;
  private String artist;

  /**
   * a public constructor of a song
   * @param title
   * @param artist
   */
  public Song(String title, String artist) {
    this.title = title;
    this.artist = artist;
  }

  /**
   * a string representation of the song title
   * @return a string representation of the song title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * a a string representation of the  song and title
   * @return a string representation of the song and title
   */
  public String toString() {
    return this.title + " by " + this.artist;
  }



}