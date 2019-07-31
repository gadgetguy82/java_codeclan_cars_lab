import carParts.*;
import enums.Gears;
import org.junit.Before;
import org.junit.Test;
import vehicles.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
  ElectricCar electricCar;
  Engine engine;
  Tyre tyre;
  Chassis chassis;
  Seat seat;
  SteeringWheel steeringWheel;

  @Before
  public void setUp() {
    engine = new Engine(5.0, "Hybrid", "Diesel", Gears.NEUTRAL);
    tyre = new Tyre(16, "Snow", 30, 35, 5);
    chassis = new Chassis("Saloon", "Iron","Pink");
    seat = new Seat("Leather", "Bucket", true, 90);
    steeringWheel = new SteeringWheel("Dixie", true, true);
    electricCar = new ElectricCar(engine, tyre, chassis, seat, 5, steeringWheel, "Duracell");
  }

  @Test
  public void hasBattery() {
    assertEquals("Duracell", electricCar.getBattery());
  }
}
