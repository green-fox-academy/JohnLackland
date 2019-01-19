import  java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        Scanner sc = new Scanner(System.in);

        boolean win = true;

        while (win) {

            int helpingInt = sc.nextInt();

            if (helpingInt > 8) {
                System.out.println("The stored number is higher.");
            }

            else if (helpingInt < 8) {
                System.out.println("The stored number is lower.");
            }

            else {
                win = false;
            }
        }
        System.out.println("You found the number: 8!");
    }
}
