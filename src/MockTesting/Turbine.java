package MockTesting;

public class Turbine {
  private String turbineId;
  private int productivity;
  
  public Turbine(String id, int prod) {
    this.turbineId = id;
    this.productivity = prod;
  }
  
  public int getProductivity() {
    return this.productivity;
  }
}
