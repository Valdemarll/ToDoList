package Task3;

import java.io.*;

public class FileEncodingTranslater {
    private String fileAddress;
    private String fileName;


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

    public FileEncodingTranslater(String fileAddress, String fileName){
        this.fileAddress = fileAddress;
        this.fileName = fileName;
    }

    public String readingText(String encoding){
        String fileText = "";
        try(InputStream in = new FileInputStream(fileAddress + fileName);
            InputStreamReader input = new InputStreamReader(in, encoding)){

            int inputByte = input.read();
            while (inputByte != -1){
                fileText += Character.toString((char)inputByte);
                inputByte = input.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return fileText;
    }

    private void createNewEncodingFile(String newData, String encoding){
        File newFile = new File (fileAddress + encoding + "File.txt");

        try(FileOutputStream out = new FileOutputStream(fileAddress + encoding + "File.txt");
            OutputStreamWriter output = new OutputStreamWriter(out, encoding)){
            output.write(newData);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void translateEncoding(String startEncoding, String endEncoding){
        String fileText = readingText(startEncoding);
        createNewEncodingFile(fileText, endEncoding);
    }
}
