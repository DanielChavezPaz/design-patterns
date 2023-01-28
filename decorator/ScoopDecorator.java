/**
 * A representation of an ice cream scoop decorator
 * @author Daniel Chavez
 */
public abstract class ScoopDecorator extends IceCream {

  protected IceCream iceCream;
  protected int numScoops;
  protected String flavor;
  protected double flavorCost;

  /**
   * Creates a new instance of a scoop decorator
   * @param iceCream
   * @param numScoops
   */
  public ScoopDecorator(IceCream iceCream, int numScoops) {
    this.iceCream = iceCream;
    this.numScoops = numScoops;
  }

  /**
   * A string description of the scoop decorator
   * @return a string description of the scoop decorator
   */
  public String toString() {
    String scoop = "";
    if(this.numScoops == 1) {
      scoop = ", a scoop of " + this.flavor + " ice cream";
    } else if(this.numScoops > 1) {
      scoop = "," + this.numScoops + " scoops of " + this.flavor + " ice cream";
    }
    return iceCream.toString() + scoop;
  }

  /**
   * A representation of the cost of different scoops of ice cream as a double
   * @return the price of an ice cream as a double
   */
  public double getCost() {
    return this.iceCream.getCost() + this.flavorCost;
  }

}