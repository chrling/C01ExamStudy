package MockTesting;

import java.util.ArrayList;
import java.util.List;

public class PlantTest {
  // errors because mockito not installed
  public void testGetProductivity() {
    List<Turbine> t = new ArrayList<>();
    WaterLevelService waterLevelService = mock(WaterLevelService.class);
    Turbine t1 = mock(Turbine.class);
    when(waterLevelService.getWaterLevel(t1)).thenReturn(100);
    when(t1.getProductivity()).thenReturn(50);
    t.add(t1);
    
    Plant p = new Plant();
    p.setTurbines(t);
    p.setWaterLevelService(waterLevelService);
    
    assertEquals(5000, p.getProductivity());
  }
}
