import static org.junit.Assert.*;
import org.junit.Test;
public class TestCase {

    @Test
    public void getCaption() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        assertEquals("№1", case1.getCaption());
    }

    @Test
    public void setCaption() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        case1.setCaption("№2");
        assertEquals("№2", case1.getCaption());
    }

    @Test
    public void getDescription() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        assertEquals("Дело№1", case1.getDescription());
    }

    @Test
    public void setDescription() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        case1.setDescription("Дело№2");
        assertEquals("Дело№2", case1.getDescription());
    }

    @Test
    public void getImportance() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        assertEquals("Средне", case1.getImportance());
    }

    @Test
    public void setImportance() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        case1.setImportance("Неважно");
        assertEquals("Неважно", case1.getImportance());
    }

    @Test
    public void getCompleted() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        assertFalse(case1.getCompleted());
    }

    @Test
    public void setCompleted() {
        Case case1 = new Case("№1", "Дело№1", "Средне", false);
        case1.setCompleted(true);
        assertTrue(case1.getCompleted());
    }
}