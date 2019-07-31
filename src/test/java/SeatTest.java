import carParts.Seat;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeatTest {
  Seat seat;

  @Before
  public void setUp() {
    seat = new Seat("Leather", "Bucket", true, 90);
  }

  @Test
  public void hasMaterial() {
    assertEquals("Leather", seat.getMaterial());
  }

  @Test
  public void hasType() {
    assertEquals("Bucket", seat.getType());
  }

  @Test
  public void hasSeatBelt() {
    assertEquals(true, seat.getSeatBelt());
  }

  @Test
  public void canBuckleSeatBelt() {
    seat.buckle();
    assertEquals(true, seat.checkFastened());
  }

  @Test
  public void canUnbuckleSeatBelt() {
    seat.unbuckle();
    assertEquals(false, seat.checkFastened());
  }

  @Test
  public void canReclineSeat() {
    seat.recline(60);
    assertEquals(60, seat.getAngle());
  }
}
