package Task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class IteratorTest {

    @Test
    public void countingRhyme() {
        ListFilling filling = new ListFilling();
        List<Integer> list = filling.fillUp(45);

        Iterator iterator = new Iterator(list);
        assertEquals(26, iterator.countingRhyme());
    }
}