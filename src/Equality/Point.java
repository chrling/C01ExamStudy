package Equality;

public class Point {
  private final int x;
  private final int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public boolean equals(Point p) {
    return this.x == p.x && this.y == p.y;
  }
}
