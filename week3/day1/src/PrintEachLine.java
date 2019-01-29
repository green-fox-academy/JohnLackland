import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt", then prints
        // each line from the file.
        // If the program is unable to read the file (for example it does not exist),
        // then it should print the following error message: "Unable to read file: my-file.txt"

        try{
            Path filePath = Paths.get("./src/test.tx");
            //System.out.println(Files.exists(filePath));

            ArrayList<String> testList = new ArrayList<>();

            testList.addAll(Files.readAllLines(filePath));

            for (String proba:
                 testList) {
                System.out.println(proba);
            }
        }catch (Exception ex){
            System.out.println("Unable to read file: test.tx");
        }
    }
}