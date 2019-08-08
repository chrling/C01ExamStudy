package Decorator;

public class App {
  public static void main(String[] args) {
    System.out.println("The following has fancy borders and both scroll bars");
    // create base component and keep wrapping with next component
    Component view = new TextView();
    Component fancyBorder = new FancyBorder(view);
    Component hsb = new HorizontalScrollBar(fancyBorder);
    Component vsb = new VerticalScrollBar(hsb);
    vsb.draw();
    System.out.println("");
    System.out.println("The following has only scroll bars");
    // or create them all at once
    Component barsOnly =
        new VerticalScrollBar(new HorizontalScrollBar(new TextView()));
    barsOnly.draw();
  }
}
