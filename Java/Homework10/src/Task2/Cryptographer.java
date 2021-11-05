package Task2;

import java.io.*;

public class Cryptographer {
    private String fileAddress;
    private String fileName;
    private int shift;


    public String getFileAddress() {
        return fileAddress;
    }
    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getShift() {
        return shift;
    }
    public void setShift(int shift) {
        this.shift = shift;
    }

    public Cryptographer(String fileAddress, String fileName, int shift){
        this.fileAddress = fileAddress;
        this.fileName = fileName;
        this.shift = shift;
    }


    public String encryptText(){
        String fileText = "";
        try(InputStream in = new FileInputStream(fileAddress + fileName);
            InputStreamReader input = new InputStreamReader(in, "UTF-8")){

            int inputByte = input.read();
            while (inputByte != -1){
                fileText += Character.toString((char)changeByte(inputByte));
                inputByte = input.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return fileText;
    }

    private void createNewFile(String newData, String mode){
        File newFile = new File (fileAddress + mode + fileName);

        try(Writer writer = new FileWriter(fileAddress + mode + fileName)){
            writer.write(newData);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public int changeByte(int inputByte){
        if (inputByte != 10){//отслеживаю переход строк(\n)
            inputByte += shift;
        }
        return inputByte;
    }

    public void encryptFile(){
        String newText = encryptText();
        createNewFile(newText, "Encrypt");
    }

    public void decryptFile(){
        this.shift = -shift;
        String newText = encryptText();
        createNewFile(newText, "Decrypt");
    }


}
