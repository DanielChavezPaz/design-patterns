/**
 * A representation of a toystore
 * @author Daniel Chavez
 */
public abstract class ToyStore {

  /**
   * A String representation of puzzle being ordered
   * @param type
   * @return A string representation of a puzzle being ordered
   */
  public String orderPuzzle(String type) {
    Puzzle puzzle = createPuzzle(type);
    String result = puzzle.assemble() + puzzle.boxPuzzle();

    return result;
  }

  /**
   * A puzzle being created
   * @param type
   * @return A puzzle being created
   */
  public abstract Puzzle createPuzzle(String type);
}