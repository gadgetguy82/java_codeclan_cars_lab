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

  @Test
  public void canGetNoOfSeats() {
    assertEquals(5, electricCar.getNoOfSeats());
  }

  @Test
  public void canGetNoOfTyres() {
    assertEquals(4, electricCar.getNoOfTyres());
  }

  @Test
  public void startsWithZeroDistanceTravelled() {
    assertEquals(0, electricCar.getDistanceTravelled());
  }

  @Test
  public void canGetTyres() {
    assertEquals(4, electricCar.getTyres().size());
  }

  @Test
  public void canGetSeats() {
    assertEquals(5, electricCar.getSeats().size());
  }

  @Test
  public void canDrive() {
    electricCar.drive(10);
    assertEquals(10, electricCar.getDistanceTravelled());
  }

  @Test
  public void canPark() {
    electricCar.park();
    assertEquals(false, electricCar.getEngine().checkRunning());
    assertEquals(Gears.NEUTRAL, electricCar.getEngine().getGear());
  }

  @Test
  public void canChangeGear() {
    electricCar.changeGear(Gears.FIRST);
    assertEquals(Gears.FIRST, electricCar.getEngine().getGear());
  }

  @Test
  public void canChangeGearWithPaddles() {
    electricCar.changeGearWithPaddle(Gears.SECOND);
    assertEquals(Gears.SECOND, electricCar.getEngine().getGear());
  }
}
