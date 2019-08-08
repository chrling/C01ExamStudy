package Equality;

public class Point {
  private final int x;
  private final int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public Boolean equals(Point p) {
    return this.x == p.x && this.y == p.y;
  }
  
  // if we want to make ColorPoint comparable to Point, we have to overload
  // equals here
  public Boolean equals(ColorPoint cp) {
    return cp.equals(this);
  }
}
