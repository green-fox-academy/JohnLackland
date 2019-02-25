import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        //Write a Stream Expression to concatenate a Character list to a string!
        List<Character> cities = Arrays.asList('A','B','C','D','E','F','G');
        String test = cities.stream().map(String::valueOf).collect(Collectors.joining());

        System.out.println(test);
    }
}
