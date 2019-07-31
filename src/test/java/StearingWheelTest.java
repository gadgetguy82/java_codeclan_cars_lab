import carParts.StearingWheel;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StearingWheelTest {

    StearingWheel stearingWheel, stearingWheel1;

    @Before
    public void setUP(){
        stearingWheel = new StearingWheel("Dixy", true, true);
        stearingWheel1 = new StearingWheel("Honker", false, false);

    }
    @Test
    public void hasHorn(){
        assertEquals("Dixy", stearingWheel.getHorn());
    }
    @Test
    public void hasPaddleTrue(){
        assertEquals(true, stearingWheel.getPaddles());
    }
    @Test
    public void hasPaddleFalse(){
        assertEquals(false, stearingWheel1.getPaddles());
    }
    @Test
    public void hasMusicControlsTrue(){
        assertEquals(true, stearingWheel.getMusicControls());
    }
    @Test
    public void hasMusicControlsFalse(){
        assertEquals(false, stearingWheel1.getMusicControls());
    }

}
