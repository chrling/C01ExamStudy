package OperatingSystem;

import java.util.Observable;

public class OperatingSystem extends Observable {
  private static OperatingSystem os = null;
  
  private OperatingSystem() {}
  
  public void shutDown() {
    setChanged();
    notifyObservers();
    if (os.countObservers() == 0)
      System.out.println("No more programs running, shutting down");
  }
  
  public static OperatingSystem getInstance() {
    if (os == null)
      os = new OperatingSystem();
    return os;
  }
}
