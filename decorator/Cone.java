/**
 * A representation of an ice cream cone
 * @author Daniel Chavez
 */
public class Cone extends IceCream {

  private ConeType coneType;

  /**
   * Creates a new instance of an ice cream cone
   * @param coneType
   */
  public Cone(ConeType coneType) {
    this.coneType = coneType;
    if(coneType == ConeType.SUGAR_CONE) {
      this.description = "Sugar cone";
    } else if(coneType.equals(ConeType.WAFFLE_CONE)) {
      this.description = "Waffle cone";
    } else if(coneType.equals(ConeType.PRETZEL_CONE)) {
      this.description = "Pretzel cone";
    } else if(coneType.equals(ConeType.CHOCOLATE_DIPPED_CONE)) {
      this.description = "Chocolate dipped cone";
      }
  }

  /**
   * a representation of the price of a cone as a double
   * @return the value of an ice cream cone as a double
   */
  public double getCost() {
    if(this.coneType.equals(ConeType.SUGAR_CONE)) {
      return 0.75;
    } else if(this.coneType.equals(ConeType.SUGAR_CONE)) {
      return 1.2;
    } else if(this.coneType.equals(ConeType.PRETZEL_CONE)) {
      return 1.8;
    } else if(this.coneType.equals(ConeType.CHOCOLATE_DIPPED_CONE)) {
      return 1.5;
    }
      return 0.0;
  }

  /**
   * a representation of a cone as a string
   * @return the string description of an ice cream cone
   */
  public String toString() {
    return this.description;
  }
  
}