package OperatingSystem;

public class App {
  public static void main(String[] args) {
    OperatingSystem os = OperatingSystem.getInstance();
    WordDocument doc = new WordDocument();
    User user = new User();
    user.connect();
    SoftwareUpdate update = new SoftwareUpdate();
    os.shutDown();
  }
}
