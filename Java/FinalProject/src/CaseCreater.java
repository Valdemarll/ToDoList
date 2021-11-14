import java.util.List;
import java.util.Scanner;

public class CaseCreater {
    public CaseCreater(){
    }

    public Case createNewCase(String caption, String description, String importance){
        return new Case(caption, description, importance, false);
    }

    public boolean testUniqueCaption(String caption, List<Case> list){
        CaseSearcher searcher = new CaseSearcher();
        try{
            searcher.findCase(list, caption);
            System.out.println("Дело с таким именем уже есть. Постарайся не повторятся");
            return false;
        } catch (IndexOutOfBoundsException e){
            return true;
        }
    }
    
    public String setNewCaseCaption(){
        System.out.println("Введите название дела");
        return input();
    }
    
    public String setNewCaseDescription(){
        System.out.println("Введите описание дела");
        return input();
    }
    
    public String setNewCaseImportance(){
        System.out.println("Введите важность дела(Критично/Средне/Неважно)");
        return input();
    }


    private String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
