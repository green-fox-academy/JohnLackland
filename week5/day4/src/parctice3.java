import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.Map;

public class parctice3 {
    public static void main(String[] args) {
        /*
    The classic word-count algorithm: given an array of strings,
    return a Map<String, Integer> with a key for each different
     string, with the value the number of times that string appears in the array.*/

        Map<String, Integer> map = new HashMap<>();
        for (String s : strings){
            if (map.containsKey(s)){
                map.put(s, map.get(s) + 1);
            }else {
                map.put(s,1);
            }
        }
    }
}
