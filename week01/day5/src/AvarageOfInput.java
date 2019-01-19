import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        int counter = userInput;

        for (int i = 0; i < 4; i++) {

            userInput = sc.nextInt();
            counter += userInput;

        }
        System.out.println("Sum: " + counter + ", Avarage: " + counter / 5.);
    }
}
