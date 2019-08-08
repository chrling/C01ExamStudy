package Fall2015Q1;

import java.util.List;
import java.util.Set;

public class LargestAbsoluteDiscount implements ShoppingStrategy {
  
  @Override
  public Item pickItem(List<Item> wantedList, Day day) {
    double currentMax = 0;
    Item wantedItem = null;
    int i = 0;
    while (i < wantedList.size()) {
      Item currentItem = wantedList.get(i);
      Set<Discount> discounts = currentItem.getDiscounts();
      for (Discount d : discounts) {
        // if we find bigger absolute discount
        double absolute = wantedItem.getOriginalPrice() - wantedItem.getPrice(day);
        if (currentMax <= absolute) {
          currentMax = absolute;
          wantedItem = currentItem;
        }
      }
      i++;
    }
    return wantedItem;
  }
  
}
