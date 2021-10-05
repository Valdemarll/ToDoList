package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Task3.RectanglePredicates.filterRectangles;
import static Task3.RectanglePredicates.isLengthBelow100;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(101, 8);
        Rectangle r2 = new Rectangle(94, 12);
        Rectangle r3 = new Rectangle(275, 135);
        Rectangle r4 = new Rectangle(104, 43);
        Rectangle r5 = new Rectangle(34, 18);

        List<Rectangle> rectangles = new ArrayList<>(Arrays.asList(r1, r2, r3, r4, r5));
        System.out.println(filterRectangles(rectangles, isLengthBelow100()));
    }
}
