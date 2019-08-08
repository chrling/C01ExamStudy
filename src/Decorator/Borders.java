package Decorator;

public abstract class Borders implements Component {
  private Component inner;
  
  public Borders(Component c) {
    this.inner = c;
  }
  
  public void draw() {
    inner.draw();
  }
}
