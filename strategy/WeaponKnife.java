/**
 * A knife used as a weapon
 * @author Daniel Chavez
 */
public class WeaponKnife implements WeaponBehavior {

     /**
     * Creates a string representation of a character attack with an knife
     * @return a string representation of a character attack with an knife
     */
    public String attack() {
        int randomNumber = 1 + (int)((Math.random()) * 3);
        if (randomNumber == 1) {
        return "Slice with knife";
        }
        else if (randomNumber == 2) {
          return "Jab with a knife";
        }
        else
        return "Sneak up on opponent with knife";
    }
}