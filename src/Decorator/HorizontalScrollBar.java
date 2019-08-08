package Decorator;

public class HorizontalScrollBar extends Borders {
  public HorizontalScrollBar(Component c) {
    super(c);
  }
  
  public void draw() {
    super.draw();
    System.out.println("Horizontal Scroll Bar");
  }
}
