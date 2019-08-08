package Equality;

public class App {
  public static void main(String[] args) {
    Color red = new Color("Red");
    Point p1 = new Point(1,1);
    // (1,1) red
    ColorPoint cp1 = new ColorPoint(p1, red);
    // (1,1) red
    ColorPoint cp2 = new ColorPoint(new Point(1,1), new Color("Red"));
    // (1,1) red
    ColorPoint cp3 = new ColorPoint(p1, new Color("Red"));
    // reflexive
    System.out.println("Reflexivity test");
    System.out.println("cp1 == cp1: " + cp1.equals(cp1) + "\n");
    // symmetric
    System.out.println("Symmetry test");
    System.out.println("cp1 == cp2: " + cp1.equals(cp1));
    System.out.println("cp2 == cp1: " + cp2.equals(cp1) + "\n");
    // transitive - we can't compare cross can't because cp has an extra field
    System.out.println("Transitive test");
    System.out.println("cp1 == cp2: " + cp1.equals(cp2));
    System.out.println("cp2 == cp3: " + cp2.equals(cp3));
    System.out.println("cp1 == cp3: " + cp1.equals(cp3) + "\n");
    // can no longer compare point to color point
    System.out.println("Compare point to colorpoint");
    System.out.println("p1 == cp1: " + p1.equals(cp1));
  }
}
