import javax.naming.Name;
import java.util.HashMap;
import java.util.Map;

public class PracticeExercise {
    public static void main(String[] args) {

       /* Given an array of strings, return a Map<String, Integer> containing a key for
        every different string in the array, and the value is that string's length.*/
        Map<String, Integer> map = new HashMap<>();
        String[] array = new String[5];
        for (String s: array) {
            map.put(s,s.length());
        }
    }
}
