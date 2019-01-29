import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        copier("./src/my-file.txt", "./src/my-filesss.txt");

    }
    public static boolean copier(String first, String second){
        Path firstFile = Paths.get(first);
        Path secondFile = Paths.get(second);

        try{
            Files.copy(firstFile,secondFile);
            return true;
        }
        catch (IOException xs){
            return false;
        }
    }
}
