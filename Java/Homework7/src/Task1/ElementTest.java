package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class aElementTest {
    Element element1 = new Element(3);
    Element element2 = new Element(2);
    @Test
    public void next() {
        element1.setNext(element2);
        assertEquals(element2, element1.getNext());
    }

    @Test
    public void value(){
        element1.setValue(3);
        assertEquals(3, element1.getValue());

    }


    @Test
    public void testToString() {
        assertEquals("3", element1.toString());
    }
}