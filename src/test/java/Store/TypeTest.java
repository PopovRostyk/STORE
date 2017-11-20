package Store;

import Store.Type;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeTest {
    @Test
    public void testtoString(){
        Type typeSensor = Type.SENSOR;
        Type typeButton = Type.BUTTONS;
        Type typeSlider = Type.SLIDER;
        assertEquals("Sensor", typeSensor.toString());
        assertEquals("Buttons", typeButton.toString());
        assertEquals("Slider", typeSlider.toString());

    }

}