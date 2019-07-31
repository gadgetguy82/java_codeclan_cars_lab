import org.junit.Before;
import org.junit.Test;
import places.Toilet;

import static org.junit.Assert.assertEquals;

public class ToiletTest {
  Toilet toilet;

  @Before
  public void setUp() {
    toilet = new Toilet();
  }

  @Test
  public void toiletStartsEmpty() {
    assertEquals(false, toilet.checkToilet());
  }
}
