/**
 * A representation of an ice cream bowl
 * @author Daniel Chavez
 */
public class Bowl extends IceCream {

  /**
   * Creates a new instance of an ice cream bowl
   */
  public Bowl() {
    this.description = "Bowl";

  }

  /**
   * represents the cost of the bowl as a double
   * @return the value of the bowl as a double
   */
  public double getCost() {
    return 0.0;
  }

  /**
   * represents the description of the bowl as a string
   * @return a string description of the bowl
   */
  public String toString() {
    return this.description;
  }
}