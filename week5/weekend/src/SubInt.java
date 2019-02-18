import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,45,44,556,545,555555554);
        System.out.println(returnIndexes(9,numbers));
    }

    public static List<Integer> returnIndexes(int isItIn,List<Integer> numbers){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            String actualNumber = "" + numbers.get(i);
            String[] helpingStringArray = actualNumber.split("" + isItIn);
            if(helpingStringArray.length == 0 || !helpingStringArray[0].equals(actualNumber)){
                list.add(i);
            }
        }
        return list;
    }
}
