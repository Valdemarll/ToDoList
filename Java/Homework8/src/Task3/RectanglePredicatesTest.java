package Task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static Task3.RectanglePredicates.*;

public class RectanglePredicatesTest {

    @Test
    public void isLengthBelow100Test() {
        Rectangle r1 = new Rectangle(101, 8);
        Rectangle r2 = new Rectangle(94, 12);
        Rectangle r3 = new Rectangle(275, 135);
        Rectangle r4 = new Rectangle(104, 43);
        Rectangle r5 = new Rectangle(34, 18);

        List<Rectangle> rectangles = new ArrayList<>(Arrays.asList(r1, r2, r3, r4, r5));
        assertEquals("[\nRectangle{length:94; width:12}, \nRectangle{length:34; width:18}]",
                filterRectangles(rectangles, isLengthBelow100()).toString());
    }
}