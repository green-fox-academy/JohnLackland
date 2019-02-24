import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

//get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

//Collectros
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

//Statistics
        List<Integer> numbersss = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbersss.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbersss : " + stats.getSum());
        System.out.println("Average of all numbersss : " + stats.getAverage());

// some example
        long count;
        List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        Random random = new Random();

        System.out.println("Using Java 8: ");
        System.out.println("List: " +strings);

        count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);

        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        mergedString = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("List: " +integers);

        IntSummaryStatistics statss = integers.stream().mapToInt((x) ->x).summaryStatistics();

        System.out.println("Highest number in List : " + statss.getMax());
        System.out.println("Lowest number in List : " + statss.getMin());
        System.out.println("Average of all numbers : " + statss.getAverage());
        System.out.println("Random Numbers: ");

        random.ints().limit(10).sorted().forEach(System.out::println);

        //parallel processing
        count = strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);
    }
}
