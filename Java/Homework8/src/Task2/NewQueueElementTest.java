package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewQueueElementTest {
    NewQueueElement<String> element = new NewQueueElement<>("Hi");
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
        assertEquals(null, element.getNext());
    }

    @Test
    public void setPrevious() {
        NewQueueElement<Double> element2 = new NewQueueElement<>(5.7);
        element.setNext(element2);
        assertEquals(element2, element.getNext());
    }

    @Test
    public void testToString() {
        assertEquals("Hi", element.toString());
    }
}