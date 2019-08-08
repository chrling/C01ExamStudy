package Fall2015Q1;

public class Discount {
  private Day d;
  private double percentDiscount;
  
  public Discount(Day d, double percentDiscount) {
    this.d = d;
    this.percentDiscount = percentDiscount;
  }
  
  public double getDiscountPercent(Day day) {
    if (day.equals(this.d))
      return percentDiscount;
    else
      return 0;
  }
}
