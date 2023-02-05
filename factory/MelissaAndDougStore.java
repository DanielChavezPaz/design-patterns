/**
 * A representation of a Melissa and Doug Store
 * 
 * @author Daniel Chavez
 */
public class MelissaAndDougStore extends ToyStore {

  /**
   * A representation of a puzzle made from Melissa and Doug
   * 
   * @param type
   * @return A Puzzle represented as a string
   */
  public Puzzle createPuzzle(String type) {
    if (type.equalsIgnoreCase("color")) {
      return new WoodColorPuzzle();
    } else if (type.equalsIgnoreCase("animal")) {
      return new WoodAnimalPuzzle();
    }

    return null;
  }
  
}