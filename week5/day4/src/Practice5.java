import java.util.HashMap;
import java.util.Map;

public class Practice5 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        for (String s : strings){
            if (map.containsKey(s)){
                map.put(s,map.get(s) +1);
            }else {
                map.put(s,1);
            }
        }


        return ;
    }
}
