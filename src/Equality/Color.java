package Equality;

public class Color {
  private final String color;
  
  public Color(String color) {
    this.color = color;
  }
  
  public Boolean equals(Color c) {
    return this.color.equals(c.color);
  }
}
