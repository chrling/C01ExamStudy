package Circles;

public class EllipseTest {
  public static void main(String[] args) {
    Circle c = new Circle(2);
    Ellipse e1 = new Ellipse(2,1);
    Ellipse e2 = new Ellipse(2,2);
    
    System.out.println("Area of c = " + c.area());
    System.out.println("Area of e1 = " + e1.area());
    System.out.println("Area of e2 = " + e2.area());
    
  }
}
