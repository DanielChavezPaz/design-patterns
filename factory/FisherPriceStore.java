/**
 * A representation of a Fisher Price Store
 * @author Daniel Chavez
 */
public class FisherPriceStore extends ToyStore {

  /**
   * A representation of a puzzle made from Fisher Price
   * @param type
   * @return A Puzzle represented as a string
   */
  public Puzzle createPuzzle(String type) {
    if(type.equalsIgnoreCase("color")) {
      return new PlasticColorPuzzle();
    } else if(type.equalsIgnoreCase("animal")) {
      return new PlasticAnimalPuzzle();
    } 

    return null;
  }

}