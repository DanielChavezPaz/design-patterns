/**
 * A representation of a watchman
 * @author Daniel Chavez 
 */

import java.util.ArrayList;

public class Watchman implements Subject{

  int warning;
  ArrayList <Observer> observers;

  /**
   * Creates a new list of observers to keep updated
   */
  public Watchman(){
    observers = new ArrayList<Observer>();
  }

  /**
   * adds a new observer to the list of observers
   */
  public void registerObserver(Observer observer) {
  observers.add(observer);
  }

  /**
   * removes an observer from the list of observers
   */
  public void removeObserver(Observer observer) {
  observers.remove(observer);
  }

  /**
   * updates observers on new warnings 
   */
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(warning);
    }
  }

  /**
   * issues a warning based on severity 
   * and notifies observers
   * @param warning
   */
  public void issueWarning(int warning) {
    if (warning == 1) {
      System.out.println("WARNING: 1 trumpet was played");
      this.warning = warning;
      notifyObservers();
    } else if (warning == 2) {
      System.out.println("WARNING: 2 trumpets were played!");
      this.warning = warning;
      notifyObservers();
    }
  }


    }
