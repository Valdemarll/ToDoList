import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestCasesListSaver {

    @Test
    public void formattingToString() {
        CasesListSaver saver = new CasesListSaver();
        List<Case> list = new ArrayList<>();
        list.add(new Case("№1", "Дело№1", "Средне", false));
        assertEquals("№1==Дело№1==Средне==false~~\n", saver.formattingToString(list));
    }
}