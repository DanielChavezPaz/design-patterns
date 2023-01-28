/**
 * A representation of a vanilla ice cream
 * @author Daniel Chavez
 */
public class Vanilla extends ScoopDecorator {
  /**
   * Creates a new instance of a vanilla ice cream
   * @param iceCream
   * @param numScoops
   */
  public Vanilla(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    this.flavor = "vanilla";
    this.flavorCost = numScoops * 1.25;
  }

}