import carParts.Engine;
import enums.Gears;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
  Engine engine;

  @Before
  public void setUp() {
    engine = new Engine(5.0, "Hybrid", "Diesel", Gears.NEUTRAL);
  }

  @Test
  public void hasSize() {
    assertEquals(5.0, engine.getSize(), 0.1);
  }

  @Test
  public void hasType() {
    assertEquals("Hybrid", engine.getType());
  }

  @Test
  public void hasFuelType() {
    assertEquals("Diesel", engine.getFuelType());
  }

  @Test
  public void hasGear() {
    assertEquals(Gears.NEUTRAL, engine.getGear());
  }

  @Test
  public void canStart(){
    engine.start();
    assertEquals(true, engine.checkRunning());
  }

  @Test
  public void canStop(){
    engine.start();
    engine.stop()
    assertEquals(false, engine.checkRunning());
  }

  @Test
  public void engineStartsOff(){
    assertEquals(false, engine.checkRunning());
  }

  @Test
  public void canGearUp(){
    engine.changeGear(Gears.FIRST);
    assertEquals(Gears.FIRST, engine.getGear());
  }
}
