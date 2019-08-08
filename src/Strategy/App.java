package Strategy;

public class App {
  public static void main(String[] args) {
    Store store = new Store();
    // regular day
    System.out.println("This is a regular day");
    store.listMenu("regular day");
    // christmas time
    System.out.println("\nThis is a christmas day");
    store.listMenu("Christmas");
  }
}
