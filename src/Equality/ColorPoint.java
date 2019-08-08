package Equality;

public class ColorPoint {
  private final Point p;
  private final Color c;
  
  public ColorPoint(Point p, Color c) {
    this.p = p;
    this.c = c;
  }
  
  public boolean equals(ColorPoint cp) {
    return this.p.equals(cp.p) && this.c.equals(cp.c);
  }
}
