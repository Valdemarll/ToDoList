package Task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class TextWorkerTest {

    @Test
    public void wordsCount() {
        TextWorker textWorker = new TextWorker("Book Water waTEr pen kNife bOOk water");
        assertEquals(4, textWorker.wordsCount());
    }
}