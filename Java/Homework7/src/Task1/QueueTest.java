package Task1;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queue = new Queue();
    @Test
    public void add() {
        queue.add(1);
        assertEquals(1, queue.getElement().getValue());
    }

    @Test
    public void delete() {
        queue.add(1);
        queue.add(2);
        queue.delete();
        assertEquals(2, queue.getElement().getValue());
    }
}