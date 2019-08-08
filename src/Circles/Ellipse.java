package Circles;

public class Ellipse {
  protected double semiMajorAxis;
  protected double semiMinorAxis;
  
  public Ellipse (double major, double minor) {
    this.semiMajorAxis = major;
    this.semiMinorAxis = minor;
  }

  public double area() {
    return Math.PI * this.semiMajorAxis * this.semiMinorAxis;
  }
}
