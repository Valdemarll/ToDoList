import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CaseSearcher {
    public CaseSearcher(){
    }

    public Case findCase(List<Case> caseList, String caption){
        return caseList.stream().filter(x -> caption.equals(x.getCaption())).collect(Collectors.toList()).get(0);
    }


    public String input(String action){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дела, которое нужно " + action);
        return scanner.nextLine();
    }
}
