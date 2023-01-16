/**
 * A sword used as a weapon
 * @author Daniel Chavez
 */
public class WeaponSword implements WeaponBehavior {

    /**
     * Creates a string representation of a character attack with a sword
     * @return a string representation of a character attack with a sword
     */
    public String attack() {
        int randomNumber = 1 + (int)((Math.random()) * 3);
        if (randomNumber == 1) {
        return "Lunge and strike with sword";
        }
        else if (randomNumber == 2) {
        return "Fancy turn and slice with sword";
        }
        else
        return "Jam opponents blade with sword";
    }
}