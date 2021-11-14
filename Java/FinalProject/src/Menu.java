import java.util.Scanner;
import java.util.stream.Collectors;

public class Menu {
    private CasesList casesList;
    private boolean nextCircle = true;

    public void setNextCircle(boolean nextCircle) {
        this.nextCircle = nextCircle;
    }
    public boolean getNextCircle(){
        return this.nextCircle;
    }

    public Menu(CasesList casesList){
        this.casesList = casesList;
    }

    public String mainBody(){
        System.out.println("Какое действие нужно выполнить?");
        System.out.println("  1.Добавить элемент в список");
        System.out.println("  2.Удалить дело из списка");
        System.out.println("  3.Пометить дело как выполненное");
        System.out.println("  4.Показать список дел");
        System.out.println("  5.Показать список всех выполненных дел");
        System.out.println("  6.Загрузить список дел из файла");
        System.out.println("  7.Сохранить список дел в файл");
        System.out.println("Введите нужную цифру: ");
        return input();
    }

    private String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean performAct(String number){
        switch (number){
            case "1":
                casesList.addCase();
                break;
            case "2":
                casesList.removeCase();
                break;
            case "3":
                casesList.setCaseCompleted();
                break;
            case "4":
                System.out.println(casesList.toString(casesList.getCaseList()));
                break;
            case "5":
                System.out.println(casesList.getCaseList()
                        .stream()
                        .filter(Case::getCompleted)
                        .collect(Collectors.toList()));
                break;
            case "6":
                casesList.uploadList(new CasesListUploader().setFileCaption());
                break;
            case "7":
                casesList.saveList(new CasesListSaver().setFileCaption());
                break;
            default:
                System.out.println("Вы ввели некорректный номер");
                return false;
        }
        this.exit();
        return true;
    }

    public void exit(){
        System.out.println("\nВыйти из программы?(Да/Нет)");
        String answer = input();
        if (answer.equals("Да")){
            this.setNextCircle(false);
        }
    }

    public void saveList(){
        casesList.saveList("ListSaver.txt");
    }
}
