/**
 * A representation of a ShopOwner
 */
public class ShopOwner implements Observer {

    private Subject watchman;

    /**
     * Creates a new ShopOwner observer
     * @param watchman
     */
    public ShopOwner(Subject watchman) {
      this.watchman = watchman;
      watchman.registerObserver(this);
    }

    /**
     * Creates an update based on the severity of
     * the warning
     * 
     * @param warning
     */
    public void update(int warning) {
    if(warning == 1) {
      System.out.println("Shop Owner: Close down shop and head home");
    } else if ( warning == 2) {
      System.out.println("Shop Owner: Drops everything and find nearest hideout");
    }
    }

}