/**
 * a representation of a scoop of chocolate ice cream
 * @author Daniel Chavez
 */
public class Chocolate extends ScoopDecorator {

  /**
   * Creates a new instance of chocolate ice cream
   * @param iceCream
   * @param numScoops
   */
  public Chocolate(IceCream iceCream, int numScoops) {
    super(iceCream, numScoops);
    this.flavor = "chocolate";
    this.flavorCost += numScoops * 1.5;
  }

}