/**
 * A representation of a jukeBox
 * @author Daniel Chavez
 */
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class JukeBox {
  private static JukeBox jukeBox;
  private ArrayList<Song> songs;
  private Queue<String> songQueue;

  /**
   * A constructor for a jukebox object
   */
  private JukeBox() {
    songs = DataLoader.getSongs();
    songQueue = new LinkedList<String>();
  }

  /**
   * an instance of a jukebox for reusability
   * @return an instance of a jukebox
   */
  public static JukeBox getInstance() {
    if(jukeBox == null) {
      jukeBox = new JukeBox();
    }
    return jukeBox;
  }

  /**
   * a method that returns the next song in the queue
   * @return will return the song currently playing or a message
   * telling a user to add more songs to the list
   */
  public String playNextSong() {
    String songTitle = songQueue.remove();
    if(songTitle == null) {
      return "You need to add songs to the list";
    }
    Song currentSong = null;
    for(Song song: songs) {
      if(song.getTitle().equalsIgnoreCase(songTitle)) {
        currentSong = song;
      }
    }
    return "Let's jam to " + currentSong;
  }

  /**
   * a method that puts a song in the queue
   * @param title
   * @return a statement that either the jukebox does not have the song
   * or the songs turn in the queue
   */
  public String requestSong(String title) {
    boolean isValid = false;
    Song nextSong = null;
    for (Song song : songs) {
      if (song.getTitle().equalsIgnoreCase(title)) {
        nextSong = song;
        isValid = true;
      }
    }
    if (isValid == false) {
      return "Sorry we do not have the song " + title;
    }
    songQueue.add(nextSong.getTitle());
    return title + " is now number " + songQueue.size();
  }

  /**
   * a method which notifies users if there are more songs in the queue
   * @return a boolean value based on whether there is another song to be play
   */
  public boolean hasMoreSongs() {
    return !songQueue.isEmpty();
  }
}