package exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise10 {
    public static void main(String[] args) {
      List<Fox> foxes = new ArrayList<>(returnFoxList());
      List<String> greenFoxesAndYoungerThenFive = foxes.stream().
              filter((fox-> fox.getColor().equals("Green") && fox.getAge() < 5))
              .map(Fox::getName)
              .collect(Collectors.toList());
        System.out.println(greenFoxesAndYoungerThenFive);

        Map<String, Long> colorsWithNumbers = foxes.stream()
                .map(Fox::getColor)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(colorsWithNumbers);



    }

    public  static List<Fox> returnFoxList(){
        return Arrays.asList(new Fox("Orange", "Roka1", 10),
                             new Fox("Black", "Roka2", 12),
                             new Fox("Green", "Roka3", 3),
                             new Fox("Black", "Roka4", 4),
                             new Fox("Yellow", "Roka5", 1));

    }
}
