/**
 * A representation of an Album
 * @author Daniel Chavez
 */
public class Album {
  private Song [] songs;
  private int count;
  private String name;

  /**
   * A representation of an album object
   * @param name
   */
  public Album(String name) {
    songs = new Song[20];
    this.name = name;
    this.count = 0;

  }

  /**
   * A method used to add a song to an album
   * @param name
   * @param artist
   * @param length
   * @param genre
   * @return A boolean value signifying if the song was successfully added or not
   */
  public boolean addSong(String name, String artist, double length, 
  Genre genre) {
    boolean isValid = false;
    if(this.count < 19) {
      Song temp = new Song(name, artist, length, genre);
      songs[count] = temp;
      this.count++;
      isValid = true;
    }
    return isValid;
  }

  /**
   * Creates a new album iterator object
   * @return an AlbumIterator of length songs
   */
  public AlbumIterator createIterator() {
    return new AlbumIterator(songs);
  }

  /**
   * @return A string representation of the album name;
   */
  public String getName() {
    return this.name;
  }
}