import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] ));
        //  should print: `[1, 11, 34, 52, 61]`

        List<Integer> valami = Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34);
        System.out.println(unique(valami).toString());
    }

    public static List<Integer> unique(List<Integer> something){
        List<Integer> list = new ArrayList<>();
        for (Integer number : something) {
            if (list.size() == 0 || !list.contains(number)){
                list.add(number);
            }
        }
        return list;
    }
}
