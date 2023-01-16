/**
 * A knight video game character
 * @author Daniel Chavez
 */
public class Knight extends Character {
    
  /**
   * Creates a new knight with the indicated name
   * @param name the name of the knight
   */
  public Knight(String name) {
    super(name);
    weaponBehavior = new WeaponBow();
  }

  /**
   * Creates a string representation of the knight
   * @return a string representation of the knight
   */
  public String toString() {
    return name + " is a valiant knight";
  }
}