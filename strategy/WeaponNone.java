/**
 * A representation of no weapon
 * @author Daniel Chavez
 */
public class WeaponNone implements WeaponBehavior {

     /**
     * Creates a string representation of a character with no weapon
     * @return a string representation of a character with no weapon
     */
    public String attack() {
        int randomNumber = 1 + (int)((Math.random()) * 2);
        if (randomNumber == 1) {
        return "Oh no! I lost my weapon";
        }
        else
        return "No one let's me have a weapon";
    }
}