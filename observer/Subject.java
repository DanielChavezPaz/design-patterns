/**
 * A representation of a subject
 * @author Daniel Chavez
 */
public interface Subject {

  /**
   * adds a new observer to a list of observers
   * @param observer
   */
  public void registerObserver(Observer observer);

  /**
   * removes an observer already on the list of observers
   * @param observer
   */
  public void removeObserver(Observer observer);

  /**
   * notifies all observers in the list of observers
   */
  public void notifyObservers();
}