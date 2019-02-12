package swearWords;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

    public static void main(String[] args) {
        // There is a not so family friendly text in the `content.txt`
        // Create a function named familyFriendlizer that takes a filename and a list of strings as parameters
        // and remove all the given words from the file and returns the amount of the removed words.

        ArrayList<String> offensiveWords = new ArrayList<> (Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss"));
        System.out.println(familyFriendlizer("./src/swearWords/context.txt", offensiveWords)); // should print out 17
    }

    private static int familyFriendlizer(String filename, ArrayList<String> theList){
        int counter = 0;

        try {
            Path file = Paths.get(filename);
            List<String> textList = Files.readAllLines(file);
            for (String swearWord : theList) {
                for (String line : textList) {
                    if (line.contains(swearWord.substring(0, 1).toUpperCase())) {
                        counter++;

                    }
                }
            }
        }catch (Exception x){
            System.out.println("valami");
        }
        return counter;
    }
}