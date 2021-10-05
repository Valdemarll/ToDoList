package Task3;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RectanglePredicates {

    public static Predicate<Rectangle> isLengthBelow100() {
        return rectangle -> rectangle.getLength() < 100;
    }

    public static List<Rectangle> filterRectangles(List<Rectangle> rectangles, Predicate<Rectangle> predicate){
        return rectangles.stream().
                filter(predicate).
                collect(Collectors.<Rectangle>toList());
    }
}
