package Composite;

import java.util.ArrayList;

public class ComponentSet implements Component {
  private ArrayList<Component> components;
  
  public ComponentSet() {
    this.components = new ArrayList<>();
  }
  
  public void draw() {
    for (Component c : this.components) {
      c.draw();
    }
  }
  
  public void addComponent(Component c) {
    this.components.add(c);
  }
  
  public void removeComponent(Component c) {
    this.components.remove(c);
  }

}
