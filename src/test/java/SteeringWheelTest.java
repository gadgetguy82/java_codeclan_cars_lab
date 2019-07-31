import carParts.SteeringWheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SteeringWheelTest {

    SteeringWheel steeringWheel, steeringWheel1;

    @Before
    public void setUP(){
        steeringWheel = new SteeringWheel("Dixy", true, true);
        steeringWheel1 = new SteeringWheel("Honker", false, false);

    }
    @Test
    public void hasHorn(){
        assertEquals("Dixy", steeringWheel.getHorn());
    }
    @Test
    public void hasPaddleTrue(){
        assertEquals(true, steeringWheel.getPaddles());
    }
    @Test
    public void hasPaddleFalse(){
        assertEquals(false, steeringWheel1.getPaddles());
    }
    @Test
    public void hasMusicControlsTrue(){
        assertEquals(true, steeringWheel.getMusicControls());
    }
    @Test
    public void hasMusicControlsFalse(){
        assertEquals(false, steeringWheel1.getMusicControls());
    }
    @Test
    public void canTuneRadio(){
        assertEquals("You tuned the radio! to Fire in the booth!", steeringWheel.tuneRadio("Fire in the booth"));
    }

}
