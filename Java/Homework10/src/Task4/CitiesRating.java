package Task4;

import java.io.*;
import java.util.*;

public class CitiesRating {
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

    public CitiesRating(String fileAddress, String fileName){
        this.fileAddress = fileAddress;
        this.fileName = fileName;
    }

    public List<City> readingText(){
        List<City> cities = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(fileAddress + fileName))){
            String currentLine = in.readLine();

            while (currentLine != null){
                String[] data = currentLine.split("=");
                cities.add(new City(data[0], Integer.parseInt(data[1])));
                currentLine = in.readLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return cities;
    }

    private void createRatingCitiesFile(String newData){
        File newFile = new File (fileAddress + "RatingCities.txt");

        try(Writer writer = new FileWriter(fileAddress + "RatingCities.txt")){
            writer.write(newData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Integer, String> sorting(){
        List<City> cities = readingText();
        Map<Integer, String> treeMap = new TreeMap<>();
        for (City city : cities){
            treeMap.put(city.getPopulation(), city.getName());
        }
        return treeMap;
    }

    public String mapToString() {
        Map<Integer, String> map = sorting();
        String dataText = "";
        for (Map.Entry m : map.entrySet()) {
            dataText += m.getValue() + "=" + m.getKey() + "/";
        }
        return dataText;
    }

    public List<String> reverseCities(){
        String dataText = mapToString();
        String[] cities = dataText.split("/");
        List<String> sortCities = new ArrayList<String>(Arrays.asList(cities));
        Collections.reverse(sortCities);

        return sortCities;
    }

    public String listToString() {
        List<String> cities = reverseCities();
        String dataText = "";
        for (String city : cities) {
            dataText += city + "\n";
        }
        return dataText;
    }


    public void rank(){
        String sortCities = listToString();
        createRatingCitiesFile(sortCities);
    }
}
