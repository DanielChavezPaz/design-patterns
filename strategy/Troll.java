/**
 * A troll video game character
 * @author Daniel Chavez
 */
public class Troll extends Character {

  /**
   * Creates a new troll with the indicated name
   * @param name the name of the troll
   */
  public Troll(String name) {
    super(name);
    weaponBehavior = new WeaponAxe();
  }

  /**
   * Creates a string representation of a troll
   * @return a string representation of a troll
   */
  public String toString() {
    return name + " is a funny troll";
  }

}
