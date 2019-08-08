package Composite;

public class App {
  public static void main(String[] args) {
    // create components and set individually
    Component textView = new TextView();
    Component vsb = new VerticalScrollBar();
    Component hsb = new HorizontalScrollBar();
    Component fancyBorder = new FancyBorder();
    ComponentSet set = new ComponentSet();
    // add components to set
    set.addComponent(textView);
    set.addComponent(fancyBorder);
    set.addComponent(vsb);
    set.addComponent(hsb);
    // call draw on the set
    set.draw();
  }
}
