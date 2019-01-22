import java.util.*;
public class QoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        for (int i = 0; i < list.size(); i++) {
            System.out.print(theQuote(list).get(i) + " ");
        }
    }

    public static ArrayList<String> theQuote (ArrayList<String> list){
        String helping = "";
        for (int i = 0; i < list.size(); i++) {

            if(list.get(i) == "cannot"){
                helping = list.get(i);
                list.set(i, list.get(list.size()-i-1));
                list.set(list.size()-i-1, helping);
            }
        }
        return list;
    }
}
