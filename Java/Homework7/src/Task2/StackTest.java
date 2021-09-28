package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stack = new Stack();
    @Test
    public void add() {
        stack.add(1);
        assertEquals(1, stack.getElement().getValue());
    }

    @Test
    public void delete() {
        stack.add(1);
        stack.add(2);
        stack.delete();
        assertEquals(1, stack.getElement().getValue());
    }
}