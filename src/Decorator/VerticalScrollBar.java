package Decorator;

public class VerticalScrollBar extends Borders {
  
  public VerticalScrollBar(Component c) {
    super(c);
  }
  
  public void draw() {
    super.draw();
    System.out.println("VerticalScrollBar");
  }
}
