import java.util.*;
public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        System.out.println(AppendA(far));
    }
    public static List<String> AppendA (List<String> far){

        for (int i = 0; i < far.size() ; i++) {
            String helpingString = far.get(i);
             helpingString += "a";
             far.set(i, helpingString);


        }
        return far;


    }

}

