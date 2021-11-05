package Task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CityTest {

    @Test
    public void getName() {
        City city = new City("Тверь", 430000);
        assertEquals("Тверь", city.getName());
    }

    @Test
    public void setName() {
        City city = new City("Тверь", 430000);
        city.setName("Дубна");
        assertEquals("Дубна", city.getName());
    }

    @Test
    public void getPopulation() {
        City city = new City("Тверь", 430000);
        assertEquals(430000, city.getPopulation());
    }

    @Test
    public void setPopulation() {
        City city = new City("Тверь", 430000);
        city.setPopulation(500000);
        assertEquals(500000, city.getPopulation());
    }
}