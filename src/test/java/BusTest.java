import carParts.*;
import enums.Gears;
import org.junit.Before;
import org.junit.Test;
import vehicles.Bus;

import static org.junit.Assert.assertEquals;


public class BusTest {

    public class ElectricCarTest {
        Bus bus;
        Engine engine;
        Tyre tyre;
        Chassis chassis;
        Seat seat;
        SteeringWheel steeringWheel;

        @Before
        public void setUp() {
            engine = new Engine(10.0, "Big Bus Engine", "Diesel", Gears.NEUTRAL);
            tyre = new Tyre(16, "Snow", 30, 35, 5);
            chassis = new Chassis("Bus", "Big Iron", "Pink");
            seat = new Seat("Leather", "Bucket", false, 90);
            steeringWheel = new SteeringWheel("Dixie", true, true);
            bus = new Bus(engine, tyre, chassis, seat, 20, steeringWheel, true);
        }


        @Test
        public void canCheckSchoolBus() {
            assertEquals(true, bus.getisSchoolBus());
        }

    }

}