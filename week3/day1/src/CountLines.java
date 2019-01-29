import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.
        Scanner sc = new Scanner(System.in);
        String fileName = "./src/my-file.txt";

        System.out.println(lineCounter(fileName));



    }
    public static int lineCounter (String fileName){

        try {
            Path filePath = Paths.get(fileName);
            ArrayList<String> list = new ArrayList<>();

            list.addAll(Files.readAllLines(filePath));
            return list.size();
        }
        catch (Exception ex) {
            return 0;
        }

    }
}
