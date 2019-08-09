package OperatingSystem;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SoftwareUpdate implements Observer {
  private OperatingSystem os;
  
  public SoftwareUpdate() {
    this.os = OperatingSystem.getInstance();
    this.os.addObserver(this);
  }
  
  public void update(Observable o, Object arg) {
    try {
      promptToInstall();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    o.deleteObserver(this);
  }
  
  public void promptToInstall() throws InterruptedException {
    Scanner input = new Scanner(System.in);
    System.out.println("Do you want to install software updates? (y/n)");
    String s = input.next();
    if (s.equals("y"))
      installSoftwareUpdate();
  }
  
  public void installSoftwareUpdate() throws InterruptedException {
    System.out.println("Installing software update...");
    TimeUnit.SECONDS.sleep(2);
    System.out.println("Software finished installing!");
  }
}
