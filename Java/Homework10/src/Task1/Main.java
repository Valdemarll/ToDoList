package Task1;

public class Main {
    public static void main(String[] args){
        RemakingFile remake = new RemakingFile("C:\\Java\\Homework10\\src\\Task1\\", "File1.txt");

        String newData = remake.fileReading();
        remake.createNewFile(newData);
    }
}
