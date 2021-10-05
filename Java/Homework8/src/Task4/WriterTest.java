package Task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class WriterTest {

    @Test
    public void write() {
        Writer<WriteObject> writer = new Writer<>();
        assertEquals("It's Java", writer.write());
    }
}