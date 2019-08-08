package Decorator;

public class FancyBorder extends Borders {

  public FancyBorder(Component c) {
    super(c);
  }
  
  public void draw() {
    super.draw();
    System.out.println("Fancy Borders");
  }
}
