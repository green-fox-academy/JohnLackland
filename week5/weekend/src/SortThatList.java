import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortThatList {
    public static void main(String[] args) {
        System.out.println(sortTheList(true ,Arrays.asList(34, 12, 24, 9, 5)));
    }

    public static List<Integer> sortTheList(boolean increasing, List<Integer> list){
        List<Integer> theList = new ArrayList<>();
        Collections.sort(list);
        if (increasing){
            theList = list;
        } else {
            for (int i = list.size() - 1; i >= 0; i--) {
                theList.add(list.get(i));
            }
        }

        return theList;


    }
}
