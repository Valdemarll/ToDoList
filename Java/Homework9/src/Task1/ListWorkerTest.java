package Task1;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListWorkerTest {
    @Test
    public void getRepeatedElement() {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(2));

        ListWorker worker = new ListWorker(list);
        assertEquals(2, worker.getRepeatedElement());

    }

    @Test
    public void getList() {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(3));
        ListWorker worker = new ListWorker(list);

        assertEquals("[1, 2, 2, 3]", worker.getList().toString());
    }

    @Test
    public void setList() {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(2));
        list.add(new Integer(3));

        ListWorker worker = new ListWorker(list2);
        worker.setList(list);


        assertEquals("[1, 2, 2, 3]", worker.getList().toString());
    }

}