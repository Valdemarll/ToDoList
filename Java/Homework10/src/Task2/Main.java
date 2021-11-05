package Task2;


public class Main {
    public static void main(String[] args) {
        Cryptographer crypt = new Cryptographer("C:\\Java\\Homework10\\src\\Task2\\", "File2.txt", 4);
        crypt.encryptFile();
        //crypt.setFileName("EncryptFile1.txt");
        //crypt.decryptFile();
    }
}
//Шифр Цезаря