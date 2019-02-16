package rainyday;

import javax.imageio.IIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BadWater {
    public static void main(String[] args) {
        System.out.println(returnTheMostRainyCity("src/rainyday/text.txt"));
    }

    private static String returnTheMostRainyCity(String fileName) {
        Map<String, Integer> map = new HashMap<>();
        List<String> lines = new ArrayList<>(listOutTheFile(fileName));
        int maxRainyDay = 0;
        String mostRainyCity = "1";
        for (String line : lines) {
            String[] splittedLine = line.split(",");
            String city = splittedLine[1];
            if (splittedLine[2].equals("RAINY") && map.containsKey(city)) {
                map.put(city, map.get(city) + 1);
            } else if (splittedLine[2].equals("RAINY")) {
                map.put(city, 1);
            }
        }
        //int maxvalue =(Collections.max((map.values())));
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static List<String> listOutTheFile(String fileName){
        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();
        try {
        lines.addAll(Files.readAllLines(filePath));
        }catch (Exception ex) {
            System.out.println("The file is not readable");
        }
        return lines;
    }
}
