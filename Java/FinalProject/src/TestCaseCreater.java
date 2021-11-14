import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestCaseCreater {

    @Test
    public void createNewCase() {
        CaseCreater creater = new CaseCreater();
        assertEquals("\nДело '№1'\nОписание дела:\nДело№1\nВажность дела:Средне\nВыполнено: false\n",
                creater.createNewCase("№1", "Дело№1", "Средне").toString());
    }

    @Test
    public void testUniqueCaption() {
        CaseCreater creater = new CaseCreater();
        List<Case> list = new ArrayList<>();
        list.add(new Case("№1", "Дело№1", "Средне", false));
        assertTrue(creater.testUniqueCaption("№2", list));
    }
}