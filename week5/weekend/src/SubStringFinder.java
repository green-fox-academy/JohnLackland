import java.util.Arrays;
import java.util.List;

public class SubStringFinder {
    public static void main(String[] args) {
        List<String> theList = Arrays.asList("I", "am", "looking", "for", "this");
        System.out.println(returnIndexOfString("am", theList));
    }

    public static int returnIndexOfString(String findThis, List<String> inThis) {
        for (int i = 0; i < inThis.size(); i++) {
            if (inThis.get(i).contains(findThis)){
                return i;
            }
        }
        return -1;
    }
}