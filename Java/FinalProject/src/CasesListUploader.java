import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CasesListUploader {
    public CasesListUploader(){
    }

    public String readingText(String caption){
        String result = "";
        try (BufferedReader in = new BufferedReader(new FileReader("C:\\Java\\FinalProject\\src\\Lists\\" + caption))){
            String currentLine = in.readLine();

            while (currentLine != null){
                result += currentLine;
                currentLine = in.readLine();
            }
        } catch (IOException e){
            System.out.println("Файла нет, или неправильно введено имя файла");
        }
        return result;
    }

    public List<Case> formattingToList(String data){
        List<Case> caseList= new ArrayList<>();
        if (!data.equals("")) {
            String[] dataList = data.split("~~");
            for (String formatCase : dataList){
                String[] dataCase = formatCase.split("==");
                caseList.add(new Case(dataCase[0], dataCase[1], dataCase[2], Boolean.parseBoolean(dataCase[3])));

            }
            System.out.println("Успешно!");
        }
        return caseList;
    }

    public String setFileCaption(){
        System.out.println("Введите название файла:");
        return input();
    }

    private String input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
