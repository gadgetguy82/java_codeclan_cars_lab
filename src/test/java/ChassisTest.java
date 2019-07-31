import carParts.Chassis;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChassisTest {

    Chassis chassis;
    @Before
    public void setUp(){
        chassis = new Chassis("Salloon", "Iron","Pink");
    }
    @Test
    public void hasShape(){
        assertEquals("Salloon", chassis.getShape());
    }
    @Test
    public void hasMaterial(){
        assertEquals("Iron", chassis.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("Pink", chassis.getColour());
    }

}
