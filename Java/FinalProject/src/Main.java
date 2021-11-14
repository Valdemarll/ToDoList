import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Case> list = new ArrayList<>();
        CasesList casesList = new CasesList(list);
        Menu menu = new Menu(casesList);

        while (menu.getNextCircle()){
            String number = menu.mainBody();
            if (!menu.performAct(number)){
                menu.exit();
            }
        }
        menu.saveList();
    }
}
