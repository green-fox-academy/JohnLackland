import  java.util.*;
public class ElementFinder {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        String seven = finder(arrayList);
        System.out.println(seven);
    }
    public static String finder (ArrayList<Integer> arrayList){

        if (arrayList.contains(7)){
            return "hurrraaa";
        }
        else {
            return "noooo";
        }

    }
}
