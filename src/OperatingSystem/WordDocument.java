package OperatingSystem;

import java.util.Observable;
import java.util.Observer;

public class WordDocument implements Observer {
  private OperatingSystem os;
  
  public WordDocument() {
    this.os = OperatingSystem.getInstance();
    this.os.addObserver(this);
  }
  
  @Override
  public void update(Observable o, Object arg) {
    saveDocument();
    o.deleteObserver(this);
  }
  
  public void saveDocument() {
    System.out.println("saving documents");
  }
}
