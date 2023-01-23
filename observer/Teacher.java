/**
 * A representation of a Teacher
 */
public class Teacher implements Observer {

    private Subject watchman;

    /**
     * Creates a new ShopOwner observer
     * 
     * @param watchman
     */
    public Teacher(Subject watchman) {
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
        System.out.println("Teacher: Helps get every kid home safe");
      } else if (warning == 2) {
        System.out.println("Teacher: Brings all students to the underground shelter");
      }
    }

}