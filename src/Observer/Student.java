package Observer;

import java.util.Observable;
import java.util.Observer;

public class Student implements Observer {
  private Observable server;
  
  public Student() {
    server = WebMailServer.subscribe();
    server.addObserver(this);
  }
  
  @Override
  public void update(Observable o, Object arg) {
    System.out.println("Student Email:");
    System.out.println(arg);
    System.out.println("Class is cancelled, have fun!\n");
  }

}
