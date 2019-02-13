import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class moastCommonCharacterWithHashmap {
    public static void main(String[] args) {
        System.out.println(findTheMostCommonCharacter("src/days.txt"));
    }
    public static String writeFileToAString(String fileName){
        Path filePath = Paths.get(fileName);
        List<String> lines= new ArrayList<>();
        try {
            lines.addAll(Files.readAllLines(filePath));

        }catch (Exception ex){
            System.out.println("Ez szar");
        }

        String textInOneString = "";
        for (String line : lines) {
            textInOneString += line + " ";
        }
        return textInOneString;
    }

    public static Character findTheMostCommonCharacter(String fileName){
        String text = writeFileToAString(fileName);
        Map<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (characters.containsKey(text.charAt(i))){
                characters.put(text.charAt(i),characters.get(text.charAt(i)) +1);
            }else {
                characters.put(text.charAt(i),1);
            }
        }
        return Collections.max(characters.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
