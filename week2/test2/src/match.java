import java.util.*;
public class match {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));


        ArrayList<String> passz = MakingMatches(girls,boys);
        System.out.println(passz);


    }

    public static ArrayList<String> MakingMatches(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList<String> test = new ArrayList<>();

        for (int i = 0; i <boys.size(); i++) {

            if (i < girls.size()){
                test.add(0, girls.get(i));
            }

            if (i < boys.size()) {
                test.add(0,boys.get(i));
            }

        }
        return test;
    }
}
