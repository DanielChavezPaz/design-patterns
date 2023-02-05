/**
 * a representation of a puzzle
 * @author Daniel Chavez
 */
import java.util.ArrayList;

public abstract class Puzzle {
  protected String name;
  protected String material;
  protected ArrayList<String> pieces = new ArrayList<String>();

  /**
   * A string representation of the assembly of the a puzzle
   * @return A string representation of the assembly of a puzzle
   */
  public String assemble() {
    String result;
      result = "Putting together a " + this.name + "\n" +
      "This puzzle is made out of " + this.material + "\n" +
      "Adding the following pieces\n";

      for(String piece: pieces) {
        result +="-  " + piece +"\n";
      }

    return result;
  }

  /**
   * A string representation of the boxing process of a puzzle 
   * @return A string representation of the boxing process of a puzzle
   */
  public String boxPuzzle() {
    return
      "Putting the " + this.name + " in a box";
  }

}