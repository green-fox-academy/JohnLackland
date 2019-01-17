import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        for (int a = 1; a <= 10; a++)
            System.out.println(a + " * " + userInput + " = " + (a*userInput));
    }
}
