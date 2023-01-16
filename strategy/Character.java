/**
 * A video Game Character
 * @author Daniel Chavez
 * 
 */
public abstract class Character implements WeaponBehavior {
  public String name;
  public WeaponBehavior weaponBehavior;

  /**
   * Creates a new character with the indicated name
   * @param name The name of the character
   */
  public Character(String name) {
    this.name = name;
  }
  /**
   * Creates a string representation of a characters attack
   * @return a string representation of a characters attack
   */
  public String attack() {
    return this.weaponBehavior.attack();
  }

  /**
   * Creates an option to change a weapon behavior
   * @return is a void method
   */
  public void setWeaponBehavior(WeaponBehavior wb) {
    this.weaponBehavior = wb;
  }

  /**
   * Creates a string representation of this video game character
   * @return A string representation of the character
   */
  public abstract String toString();

}