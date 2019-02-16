import java.util.HashMap;
import java.util.Map;

public class parctice4 {
    public static void main(String[] args) {
        /*
Given an array of non-empty strings, return a Map<String, String> with a key
for every different first character seen, with the value of all the strings starting
 with that character appended together in the order they appear in the array.*/

        Map<String,String > map = new HashMap<>();
        for(String s : strings){
            if (map.containsKey(s.substring(0,1))){
                map.put(s.substring(0,1),map.get(s.substring(0,1)) + s);
            } else {
                map.put(s.substring(0,1),s);
            }
        }
        return map;
    }
}
