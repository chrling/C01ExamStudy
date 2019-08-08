package Strategy;

public class RegularSaleStrategy implements SaleStrategy {

  public void execute() {
    System.out.println("The following is our sales menu");
    System.out.println("Cookies are on sale for $1");
    System.out.println("Coffee is on sale for $2");
  }
  
}
