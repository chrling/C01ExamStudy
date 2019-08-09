package OperatingSystem;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
  private OperatingSystem os;
  
  public User() {
    this.os = OperatingSystem.getInstance();
  }
  
  public void connect() {
    this.os.addObserver(this);
  }
  
  public void update(Observable o, Object arg) {
    System.out.println("disconnecting user");
    disconnect();
  }
  
  public void disconnect() {
    this.os.deleteObserver(this);
  }
}
