package Fall2015Q1;

import java.util.Set;

public interface Item {
  public void setValue();
  public void setPrice();
  public void setDiscount(Day day);
  public double getValue();
  public double getOriginalPrice();
  public double getPrice(Day day);
  public Set<Discount> getDiscounts();
}
