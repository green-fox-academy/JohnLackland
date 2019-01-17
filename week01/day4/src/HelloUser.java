import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, User");

        String userInput = sc.nextLine();

        System.out.println("User name: " + userInput);


    }
}
