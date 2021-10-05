package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewStackElementTest {
    NewStackElement<String> element = new NewStackElement<>("Hi");
    @Test
    public void getValue() {
        assertEquals("Hi", element.getValue());
    }

    @Test
    public void setValue() {
        element.setValue("Bey");
        assertEquals("Bey", element.getValue());
    }

    @Test
    public void getPrevious() {
        assertEquals(null, element.getPrevious());
    }

    @Test
    public void setPrevious() {
        NewStackElement<Double> element2 = new NewStackElement<>(5.7);
        element.setPrevious(element2);
        assertEquals(element2, element.getPrevious());
    }

    @Test
    public void testToString() {
        assertEquals("Hi", element.toString());
    }
}