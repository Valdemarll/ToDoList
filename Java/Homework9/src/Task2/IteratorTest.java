package Task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class IteratorTest {

    @Test
    public void iteratorTest() {
        List list = new List();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));

        Iterator iterator = new Iterator(list);
        System.out.println(iterator.circle(4));
        iterator.setIndex(0);
        assertEquals("1\n2\n3\n4\n", iterator.circle(4));
    }

}