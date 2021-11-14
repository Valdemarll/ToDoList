import org.junit.Test;

import static org.junit.Assert.*;

public class TestCasesListUploader {

    @Test
    public void readingText() {
        CasesListUploader uploader = new CasesListUploader();
        assertEquals("№1==Дело№1==Неважно==false~~№2==Дело№2==Средне==false~~№3==Дело№3==Критично==true~~",
                uploader.readingText("List1.txt"));
    }

    @Test
    public void formattingToList() {
        CasesListUploader uploader = new CasesListUploader();
        assertEquals("[\nДело '№1'\nОписание дела:\nДело№1\nВажность дела:Неважно\nВыполнено: false\n" +
                ", \nДело '№2'\nОписание дела:\nДело№2\nВажность дела:Средне\nВыполнено: false\n" +
                ", \nДело '№3'\nОписание дела:\nДело№3\nВажность дела:Критично\nВыполнено: true\n]",
                uploader.formattingToList(uploader.readingText("List1.txt")).toString());
    }
}