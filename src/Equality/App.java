package Equality;

public class App {
  public static void main(String[] args) {
    Color red = new Color("Red");
    Point p1 = new Point(1,1);
    // (1,1) red
    ColorPoint cp1 = new ColorPoint(p1, red);
    // (1,1) red
    ColorPoint cp3 = new ColorPoint(new Point(1,1), new Color("Red"));
    
    // reflexive
    System.out.println("Reflexivity test");
    System.out.println("cp1 == cp1: " + cp1.equals(cp1).toString() + "\n");
    // symmetric
    System.out.println("Symmetry test");
    System.out.println("cp1 == cp3: " + cp1.equals(cp3).toString());
    System.out.println("cp3 == cp1: " + cp3.equals(cp1).toString() + "\n");
    // transitive
    System.out.println("Transitive test");
    System.out.println("p1 == cp1: " + p1.equals(cp1).toString());
    System.out.println("cp1 == cp3: " + cp1.equals(cp3).toString());
    System.out.println("cp3 == p1: " + cp3.equals(p1).toString());
    //
  }
}
