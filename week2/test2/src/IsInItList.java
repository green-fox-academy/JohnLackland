import java.util.*;
public class IsInItList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        ArrayList<Integer> theNumbers = new ArrayList<>(Arrays.asList( 4, 8, 12, 16));

        boolean helper = ContainsIt(list, theNumbers);
        System.out.println(helper);


    }
    public static boolean ContainsIt (ArrayList<Integer> list, ArrayList<Integer> theNumbers) {
       if( list.containsAll(theNumbers)){
            return true;
        }else {
            return false;
        }
    }

}
