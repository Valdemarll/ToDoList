package Task2;

import Task1.RemakingFile;
import org.junit.Test;
import static org.junit.Assert.*;

public class CryptographerTest {

    @Test
    public void getFileAddress() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        assertEquals("C:\\Java\\Homework10\\src\\Task2\\", crypt.getFileAddress());
    }

    @Test
    public void setFileAddress() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        crypt.setFileAddress("C:\\Screenshots\\");
        assertEquals("C:\\Screenshots\\", crypt.getFileAddress());
    }

    @Test
    public void getFileName() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        assertEquals("File1.txt", crypt.getFileName());
    }

    @Test
    public void setFileName() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        crypt.setFileName("File2.txt");
        assertEquals("File2.txt", crypt.getFileName());
    }

    @Test
    public void getShift() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        assertEquals(3, crypt.getShift());
    }

    @Test
    public void setShift() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File1.txt", 3);
        crypt.setShift(5);
        assertEquals(5, crypt.getShift());
    }

    @Test
    public void fileReading() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File2.txt", 4);
        assertEquals("Ьмшф$Ъйлдфѓ", crypt.encryptText());
    }

    @Test
    public void changeByte() {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File2.txt", 4);
        assertEquals(1220, crypt.changeByte(1216));
    }
}