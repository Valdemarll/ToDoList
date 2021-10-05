package Task1;

import static org.junit.Assert.*;
import org.junit.Test;

public class WrapperTest {


    @Test
    public void Value() {
        Wrapper<String> wrapper = new Wrapper<>("Hi");
        assertEquals("Hi", wrapper.getValue());
        wrapper.setValue("Bey");
        assertEquals("Bey", wrapper.getValue());
    }
}