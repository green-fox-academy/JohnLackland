import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMApPractice {
    public static void main(String[] args) {
        Map<String, Integer> rainyMap = new HashMap<>();
        HashMap<String, Integer> rainyHashMap = new HashMap<>();

        rainyMap.put("Budapest",0);
        System.out.println(rainyMap.get("Budapest"));
        try {
            Path filePath = Paths.get("src/days.txt");
            List<String> textList = Files.readAllLines(filePath);
            for (String line : textList) {
                if (line.equals("rainy") && rainyMap.containsKey("Budapest")){
                    System.out.println(rainyMap.values());
                    rainyMap.put("Budapest", rainyMap.get("Budapest") + 1) ;
                }
            }

        }catch (Exception ex){
            System.out.println("Szar file");
        }

    }
}
