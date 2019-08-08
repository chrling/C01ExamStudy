package Observer;

import java.util.Observable;

public class WebMailServer extends Observable {
  private static WebMailServer server = null;
  
  private WebMailServer() {}
  // observable is also a singleton
  public static WebMailServer subscribe() {
    if (server == null)
      server = new WebMailServer();
    return server;
  }
  
  public void sendSchoolClosedEmail() {
    // mandatory set changed
    setChanged();
    notifyObservers("UTSC campus is closed today");
  }
}
