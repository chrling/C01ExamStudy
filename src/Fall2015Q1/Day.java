package Fall2015Q1;

public class Day {
  String day;
  
  public Day(String s) {
    this.day = s;
  }
  
  public String getDay() {
    return this.day;
  }
  
  public boolean equals(Day d) {
    return this.day.equals(d.day);
  }
}
