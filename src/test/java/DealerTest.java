import org.junit.Before;
import org.junit.Test;
import people.Dealer;

import static org.junit.Assert.assertEquals;

public class DealerTest {
  Dealer dealer;

  @Before
  public void setUp() {
    dealer = new Dealer("Kane", 35, 200.00);
  }

  @Test
  public void hasName() {
    assertEquals("Kane", dealer.getName());
  }

  @Test
  public void hasAge() {
    assertEquals(35, dealer.getAge());
  }

  @Test
  public void hasMoney() {
    assertEquals(200.00, dealer.getMoney(), 0.01);
  }
}
