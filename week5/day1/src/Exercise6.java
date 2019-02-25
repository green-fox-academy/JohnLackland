import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {
    public static void main(String[] args) {
       // Write a Stream Expression to find the uppercase characters in a string!

        String testThis = "Make Some Exercise";

        List<Character> upperCaseLetters = testThis.codePoints()
                .mapToObj(c -> (char) c)
                //.filter(c -> c.toString().toUpperCase().equals(c.toString()))
                .filter(Character::isUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseLetters);
        List<Character> uppersCaseCharacters = testThis.chars()
                .filter(c -> Character.isUpperCase(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}
