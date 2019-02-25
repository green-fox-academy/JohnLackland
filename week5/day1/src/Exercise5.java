import java.util.Arrays;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {
        //Write a Stream Expression to get the sum of the odd numbers in the following list:

        List<Integer> numbers = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        int sumOfOddNumbers = numbers.stream()
                .filter(s -> s % 2 != 0)
                .mapToInt(p -> p).sum();
        System.out.println(sumOfOddNumbers);
    }
}
