package Task3;

public class Main {
    public static void main(String[] args) {
        FileEncodingTranslater translater = new FileEncodingTranslater(
                "C:\\Java\\Homework10\\src\\Task3\\", "FileWindows-1251.txt");
        translater.translateEncoding("windows-1251", "utf-8");
        translater.setFileName("utf-8File.txt");
        translater.translateEncoding("utf-8", "windows-1251");
    }
}
