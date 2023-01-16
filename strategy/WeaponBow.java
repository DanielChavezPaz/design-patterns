/**
 * A bow used as a weapon
 * @author Daniel Chavez
 */
public class WeaponBow implements WeaponBehavior {

     /**
     * Creates a string representation of a character attack with a Bow
     * @return a string representation of a character attack with an Bow
     */
    public String attack() {
        int randomNumber = 1 + (int)((Math.random()) * 2);
        if (randomNumber == 1) {
        return "Draw and loose an arrow";
        } else
          return "Shoot arrow high in the sky";
    }
}