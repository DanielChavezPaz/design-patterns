/**
 * A representation of a Knight
 * @author Daniel Chavez
 */
public class Knight implements Observer {

    private Subject watchman;

    /**
     * creates a new Knight observer 
     * @param watchman
     */
    public Knight(Subject watchman) {
      this.watchman = watchman;
      watchman.registerObserver(this);
    }

    /**
     * Creates an update based on the severity of
     * the warning
     * @param warning
     */
    public void update(int warning) {
      if (warning == 1) {
        System.out.println("Knight: Helps everyone get home safe");
      } else if (warning == 2) {
        System.out.println("Knight: Prepares for battle");
      }  
    }

}