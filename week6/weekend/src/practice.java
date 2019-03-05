import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A'''''''''''''");
        list.add("al'';l'l");
        list.add(".jk.j");
        list.add("gsgsaa");
        list.add("asdsagsdg");
        list.add("csgsdsaa");
        list.add("Asdsaa");
        System.out.println(retunFirstLetterA(list));
    }
    /*Filter Strings (Java 8 Lambdas and Streams)
Given a list of Strings, write a method that returns a list of all strings that start with the letter
'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.*/

    public static List<String> search(List<String> list) {

        return list.stream().filter(p->p.charAt(0)=='a' &&
                p.length()==3).collect(Collectors.toList());
    }

   /* Comma Separated (Java 8 Lambdas and Streams)
    Write a method that returns a comma separated string based on a given list of integers.
    Each element should be preceded by the letter 'e' if the number is even,
    and preceded by the letter 'o' ifthe number is odd. For example, if the input list is (3,44), the output should be 'o3,e44'.*/

    public static String getString(List<Integer> list) {
       return list.stream().map(p ->p % 2 != 1 ? "e" + p : "o" + p).collect(Collectors.joining(","));
    }

    /* you have a list of words. Filter them by the ones that start with letter “a”, convert them to uppercase and sort them.*/

    public static List<String> retunFirstLetterA(List<String> list){

        return list.stream()
                .filter(p -> p.toLowerCase().charAt(0)=='a')
                .map(String::toUpperCase).sorted()
                .collect(Collectors.toList());
    }
}
