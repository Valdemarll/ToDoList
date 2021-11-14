import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TestCaseSearcher {

    @Test
    public void findCase() {
        CaseSearcher searcher = new CaseSearcher();
        List<Case> list = new ArrayList<>();
        list.add(new Case("№1", "Дело№1", "Средне", false));
        assertEquals("\nДело '№1'\nОписание дела:\nДело№1\nВажность дела:Средне\nВыполнено: false\n",
                searcher.findCase(list, "№1").toString());
    }
}