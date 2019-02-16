import java.util.HashMap;
import java.util.Map;

public class PreacticeExercise2 {
    public static void main(String[] args) {

       /* Given an array of non-empty strings, create and return a Map<String, String> as follows: for each
        string add its first character as a key with its last character as the value.*/

        Map<String,String> map = new HashMap<>();
        String[] array = new String[5];

        for (String s : array){
            map.put(s.substring(0,0), s.substring(s.length() -1));
        }
    }
}
