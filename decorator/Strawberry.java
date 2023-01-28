/**
 * A representation of a strawberry ice cream
 * @author Daniel Chavez
 */
public class Strawberry extends ScoopDecorator {

  /**
   * Creates a new instance of a strawberry ice cream
   * @param iceCream
   * @param numScoops
   */
  public Strawberry(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    this.flavor = "strawberry";
    this.flavorCost += numScoops * 1.4;
    }

}