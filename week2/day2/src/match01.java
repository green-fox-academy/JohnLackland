import java.util.*;
public class match01 {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
        ArrayList<String> test = new ArrayList<>();
        ArrayList<String> passz = MakingMatches(girls,boys,test);


    }

    public static ArrayList<String> MakingMatches(ArrayList<String> girls, ArrayList<String> boys, ArrayList<String> test){

        for (int i = 0; i <boys.size(); i++) {

            if (i < girls.size()){
                test.add(i, girls.get(i));
            }

            if (i < boys.size()) {
                test.add(i,boys.get(i));
            }
            System.out.println(test.get(i));
        }
        return test;
    }
}
