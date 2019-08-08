package Fall2015Q1;

import java.util.List;

public interface ShoppingStrategy {
  public Item pickItem(List<Item> wantedList, Day day);
}
