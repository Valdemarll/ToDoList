package Task3;

import Task1.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    List list = new List();
    @Test
    public void add() {
        list.add(1);
        assertEquals(1, list.getElement(0).getValue());
    }

    @Test
    public void reverse() {
        list.add(1);
        list.add(2);
        list.add(3);
        Element lastEl = list.getElement(2);
        list.reverse();
        assertEquals(lastEl, list.getElement(0));
    }
}