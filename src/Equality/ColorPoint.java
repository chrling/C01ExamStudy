package Equality;

public class ColorPoint {
  private final Point p;
  private final Color c;
  
  public ColorPoint(Point p, Color c) {
    this.p = p;
    this.c = c;
  }
  
  public Boolean equals(ColorPoint cp) {
    return this.p.equals(cp.p) && this.c.equals(cp.c);
  }
  
  // implement this only if we want point and color point to be comparable
  public Boolean equals(Point p) {
    return this.p.equals(p);
  }
}
