/**
 * A king video game character
 * @author Daniel Chavez
 */
public class King extends Character {

  /**
   * Creates a new King with the indicated name
   * @param name The name of the king
   */
  public King(String name) {
    super(name);
    weaponBehavior = new WeaponSword();
  }
    
  /**
   * Creates a string representation of the king
   * @return a string representation of the king
   */
  public String toString() {
    return name + " is a Noble king";
  }
}