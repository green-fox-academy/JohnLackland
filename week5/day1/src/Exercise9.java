import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {
        //Write a Stream Expression to find the frequency of characters in a given string!
        String test = "bbarmi";

        Map<Character, Long> map = test.codePoints().mapToObj(c -> (char) c)
                .filter(c ->c.equals(' '))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
    }
}
