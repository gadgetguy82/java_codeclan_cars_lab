import carParts.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {
  Engine engine;

  @Before
  public void setUp() {
    engine = new Engine(5.0, "Hybrid", "Diesel");
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

  
}
