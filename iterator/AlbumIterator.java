/**
 * A representation of an album iterator
 * @author Daniel Chavez
 */
import java.util.Iterator;

public class AlbumIterator implements Iterator {
  Song [] songs;
  int position = 0;

  /**
   * constructs a new album iterator
   * @param songs
   */
  public AlbumIterator(Song [] songs) {
  this.songs = songs;
  }

  /**
   * @return a boolean statement depending on whether there is 
   * another song to play
   */
  public boolean hasNext() {
    if(position >= songs.length || songs[position] == null) {
      return false;
    }
    return true;
  }

  /**
   * @return A song that is next up to be played
   */
  public Song next() {
    /*   if(hasNext()) {
        this.position += 1;
        return this.song[this.position];
    }
    return this.song[this.position];
  }
  */

  Song song = songs[position];
  position = position + 1;
  return song;
}

}


  