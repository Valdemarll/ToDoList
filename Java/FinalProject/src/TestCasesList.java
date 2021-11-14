import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCasesList {

    @Test
    public void getCaseList() {
        CasesList casesList = new CasesList(new ArrayList<Case>());
        casesList.getCaseList().add(new Case("№1", "Дело№1", "Средне", false));
        assertEquals("[\nДело '№1'\nОписание дела:\nДело№1\nВажность дела:Средне\nВыполнено: false\n]",
                casesList.getCaseList().toString());
    }

    @Test
    public void uploadList() {
        CasesList casesList = new CasesList(new ArrayList<Case>());
        casesList.uploadList("List1.txt");
        assertEquals("[\nДело '№1'\nОписание дела:\nДело№1\nВажность дела:Неважно\nВыполнено: false\n" +
                ", \nДело '№2'\nОписание дела:\nДело№2\nВажность дела:Средне\nВыполнено: false\n" +
                ", \nДело '№3'\nОписание дела:\nДело№3\nВажность дела:Критично\nВыполнено: true\n]", casesList.getCaseList().toString());
    }
}