import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.Scanner;

public class CasesListSaver {
    public CasesListSaver(){
    }

    public void createNewFile(String caption){
        File newFile = new File ("C:\\Java\\FinalProject\\src\\Lists\\" + caption);
    }

    public String formattingToString(List<Case> list){
        String result = "";
        for (Case c : list) {
            result += c.getCaption() + "==" + c.getDescription() + "==" + c.getImportance() + "==" + c.getCompleted() + "~~\n";
        }
        return result;
    }

    public void fileWriting(String newData, String caption){
        try(Writer writer = new FileWriter("C:\\Java\\FinalProject\\src\\Lists\\" + caption)){
            writer.write(newData);
            System.out.println("Успешно!");
        } catch (IOException e) {
            System.out.println("Не удалось сохранить список дел. Возможно неправильно введено имя файла");
        }
    }

    public String setFileCaption(){
        System.out.println("Введите название файла(*.txt):");
        return input();
    }

    private String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
