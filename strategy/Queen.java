/**
 * A queen video game character
 * @author Daniel Chavez
 */
public class Queen extends Character {

  /**
   * Creates a new queen with the indicated name
   * @param name is the name of the queen
   */
  public Queen(String name) {
    super(name);
    weaponBehavior = new WeaponKnife();
  }

  /**
   * Creates a string representation of the queen
   * @return a string representation of the queen
   */
  public String toString() {
    return name + " is a beautiful queen";
  }

}