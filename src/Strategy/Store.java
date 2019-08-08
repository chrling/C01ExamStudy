package Strategy;

public class Store {
  private SaleStrategy regular;
  private SaleStrategy christmas;
  
  public Store() {
    regular = new RegularSaleStrategy();
    christmas = new ChristmasSaleStrategy();
  }
  
  public void listMenu(String date) {
    if (date.equals("Christmas"))
      christmas.execute();
    else
      regular.execute();
  }
}
