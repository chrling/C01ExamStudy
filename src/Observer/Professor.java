package Observer;

import java.util.Observable;
import java.util.Observer;

public class Professor implements Observer {
  private Observable server;
  
  public Professor() {
    server = WebMailServer.subscribe();
    server.addObserver(this);
  }
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Prof Email:");
    System.out.println(arg);
    System.out.println("No class today, don't have to deal with students");
  }
  
}
