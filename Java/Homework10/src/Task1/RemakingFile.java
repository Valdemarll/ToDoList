package Task1;

import java.io.*;

public class RemakingFile {
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


    public RemakingFile(String fileAddress, String fileName){
        this.fileAddress = fileAddress;
        this.fileName = fileName;
    }


    public String fileReading(){
        String fileText = "";

        try (BufferedReader in = new BufferedReader(new FileReader(fileAddress + fileName))){
            String currentLine = in.readLine();

            while (currentLine != null){
                fileText += changeData(currentLine) + "\n";
                currentLine = in.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

        return fileText;
    }

    public void createNewFile(String newData){
        File newFile = new File (fileAddress + "New" + fileName);

        try(Writer writer = new FileWriter(fileAddress + "New" + fileName)){
            writer.write(newData);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String changeData(String data){
        int length = data.length();
        return data + Integer.toString(length);
    }

}
