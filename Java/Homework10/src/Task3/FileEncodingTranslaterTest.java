package Task3;

import Task1.RemakingFile;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileEncodingTranslaterTest {

    @Test
    public void getFileAddress() {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task3\\", "FileWindows-1251.txt");
        assertEquals("C:\\Java\\Homework10\\src\\Task3\\", translater.getFileAddress());
    }

    @Test
    public void setFileAddress() {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task3\\", "FileWindows-1251.txt");
        translater.setFileAddress("C:\\Screenshots\\");
        assertEquals("C:\\Screenshots\\", translater.getFileAddress());
    }

    @Test
    public void getFileName() {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task3\\", "FileWindows-1251.txt");
        assertEquals("FileWindows-1251.txt", translater.getFileName());
    }

    @Test
    public void setFileName() {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task3\\", "FileWindows-1251.txt");
        translater.setFileName("File2.txt");
        assertEquals("File2.txt", translater.getFileName());
    }

    @Test
    public void readingText() {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task2\\", "File2.txt");
        assertEquals("Шифр Цезаря", translater.readingText("utf-8"));
    }
}