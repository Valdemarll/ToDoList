package Task5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DownSortingTest {
    @Test
    public void sorting() {
        DownSorting sorting = new DownSorting();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(26);
        list.add(13);
        list.add(21);
        list.add(2);

        sorting.setList(new ArrayList<Integer>(list));
        assertEquals("[26, 21, 13, 2, 1]", sorting.sorting().toString());
    }
}