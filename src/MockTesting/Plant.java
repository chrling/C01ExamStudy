package MockTesting;

import java.util.List;

public class Plant {
  private WaterLevelService waterLevelService;
  private List<Turbine> turbines;

  public void setWaterLevelService(WaterLevelService w) {
    waterLevelService = w;
  }

  public void setTurbines(List<Turbine> t) {
    turbines = t;
  }

  public double getProductivity() {
    double productivity = 0.0;
    for (Turbine turbine : turbines) {
      productivity += waterLevelService.getWaterLevel(turbine)
          * turbine.getProductivity() / 100;
    }
    return productivity;
  }
}
