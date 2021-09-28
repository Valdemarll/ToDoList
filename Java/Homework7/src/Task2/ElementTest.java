package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElementTest {
    Element element1 = new Element(1);
    Element element2 = new Element(1);
    @Test
    public void value() {
        element1.setValue(2);
        assertEquals(2, element1.getValue());
    }

    @Test
    public void previous() {
        element1.setPrevious(element2);
        assertEquals(element2, element1.getPrevious());
    }

    @Test
    public void testToString() {
        assertEquals("1", element1.toString());
    }
}