import carParts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
  Tyre tyre;

  @Before
  public void setUp() {
    tyre = new Tyre(16, "Snow", 32);
  }

  @Test
  public void hasSize() {
    assertEquals(16, tyre.getSize());
  }

  @Test
  public void hasType() {
    assertEquals("Snow", tyre.getType());
  }

  @Test
  public void hasPressure() {
    assertEquals(32, tyre.getPressure());
  }

  @Test
  public void canInflate() {
//    tyre.inflate();
//    assertEquals();
  }
}
