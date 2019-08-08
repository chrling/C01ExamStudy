package Observer;

public class App {
  public static void main(String[] args) {
    // probably not a good name for a constructor method, too lazy to change
    WebMailServer server = WebMailServer.subscribe();
    Student student = new Student();
    Professor prof = new Professor();
    server.sendSchoolClosedEmail();
  }
}
