import carParts.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {
  Tyre tyre;

  @Before
  public void setUp() {
    tyre = new Tyre(16, "Snow", 30, 35, 5);
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
    assertEquals(30, tyre.getPressure());
  }

  @Test
  public void canInflate() {
    tyre.inflate();
    assertEquals(35, tyre.getPressure());
  }

  @Test
  public void checkTread() {
    assertEquals(5, tyre.checkTread());
  }
}
