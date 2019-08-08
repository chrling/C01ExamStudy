package Fall2015Q1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingPlanner {
  private ShoppingStrategy strategy;
  
  public ShoppingPlanner(ShoppingStrategy strat) {
    this.strategy = strat;
  }
  
  
  
  public List<Item> makeList(Day day, List<Item> wantedItems, double budget){
    List<Item> items = new ArrayList<>();
    Item item;
    double budgetRemaining = budget;
    
    while (!wantedItems.isEmpty()) {
      item = strategy.pickItem(wantedItems, day);
      if (item.getPrice(day) > budgetRemaining) {
        wantedItems.remove(item);
        continue;
      }
      items.add(item);
      budgetRemaining -= item.getPrice(day);
    }
    
    return items;
  }
}
