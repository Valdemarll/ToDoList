package Task1;

import static org.junit.Assert.*;
import org.junit.Test;
public class RemakingFileTest {

    @Test
    public void getFileAddress() {
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File1.txt");
        assertEquals("C:\\Java\\Homework10\\src\\Task1\\", remake.getFileAddress());
    }

    @Test
    public void setFileAddress() {
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File1.txt");
        remake.setFileAddress("C:\\Screenshots\\");
        assertEquals("C:\\Screenshots\\", remake.getFileAddress());
    }

    @Test
    public void getFileName() {
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File1.txt");
        assertEquals("File1.txt", remake.getFileName());
    }

    @Test
    public void setFileName() {
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File1.txt");
        remake.setFileName("File2.txt");
        assertEquals("File2.txt", remake.getFileName());
    }

    @Test
    public void fileReading() {
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File2.txt");
        assertEquals("Реализовать11\nпрограмму9\n", remake.fileReading());
    }
}