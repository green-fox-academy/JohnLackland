import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class alap {
    public static void hashMapWriter() {
        Map<String, Integer> map = new HashMap<>();
        for ( : ){
            if (map.containsKey()){
                map.put( , map.get() +1);
            } else {
                map.put( , 1);
            }
        }
    }

    //How to get the max value key of a hashmap:
    //Collections.max((ide jon a hashmap neve zarojel nelkul).entrySet(), Map.Entry.comparingByValue()).getKey();
    //same with min
    //Collections.min((ide jon a hashmap neve zarojel nelkul).entrySet(), Map.Entry.comparingByValue()).getKey();

    public static void fileReader(String fileName){
        Path filePath = Paths.get(fileName);
        List<String> line = new ArrayList<>();
        try {
            line.addAll(Files.readAllLines(filePath));
        }catch (Exception ex){
            System.out.println("The file is not readable");
        }
    }
}
