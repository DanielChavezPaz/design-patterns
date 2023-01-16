/**
 * An axe used as a weapon
 * @author Daniel Chavez
 */
public class WeaponAxe implements WeaponBehavior {

    /**
     * Creates a string representation of a character attack with an axe
     * @return a string representation of a character attack with an axe
     */
    public String attack() {
        int randomNumber = 1 + (int)((Math.random()) * 2);
        if (randomNumber == 1) {
        return "Swing an axe";
        } else 
          return "Twirl with an axe";
    }
}