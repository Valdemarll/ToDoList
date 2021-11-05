package Task4;

import Task3.FileEncodingTranslater;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CitiesRatingTest {

    @Test
    public void getFileAddress() {
        CitiesRating rating = new CitiesRating("C:\\Java\\Homework10\\src\\Task4\\", "Cities.txt");
        assertEquals("C:\\Java\\Homework10\\src\\Task4\\", rating.getFileAddress());
    }

    @Test
    public void setFileAddress() {
        CitiesRating rating = new CitiesRating("C:\\Java\\Homework10\\src\\Task4\\", "Cities.txt");
        rating.setFileAddress("C:\\Screenshots\\");
        assertEquals("C:\\Screenshots\\", rating.getFileAddress());
    }

    @Test
    public void getFileName() {
        CitiesRating rating = new CitiesRating("C:\\Java\\Homework10\\src\\Task4\\", "Cities.txt");
        assertEquals("Cities.txt", rating.getFileName());
    }

    @Test
    public void setFileName() {
        CitiesRating rating = new CitiesRating("C:\\Java\\Homework10\\src\\Task4\\", "Cities.txt");
        rating.setFileName("Towns.txt");
        assertEquals("Towns.txt", rating.getFileName());
    }

    @Test
    public void rank() {
        CitiesRating rating = new CitiesRating("C:\\Java\\Homework10\\src\\Task4\\", "Cities.txt");
        String rightAnswer = "Шанхай=23400000\n" +
                "Мумбаи=15400000\n" +
                "Санкт-Петербург=5130000\n" +
                "Берлин=3480000\n" +
                "Рим=2760000\n";
        assertEquals(rightAnswer, rating.listToString());
    }

}