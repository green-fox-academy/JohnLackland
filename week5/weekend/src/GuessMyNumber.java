import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        makeTheGuess();
    }

    public static int makeARandomNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose two number to make guess game between them.");
        int lowerNumber = sc.nextInt();
        int higherNumber = sc.nextInt();
        System.out.println("Make a guess between " + lowerNumber + " and " + higherNumber);
        return (lowerNumber + (int) (Math.random() * higherNumber));
    }

    public static void makeTheGuess(){
        Scanner sc = new Scanner(System.in);
        int theRandomNumber = makeARandomNumber();

        for (int i = 5; i > 0; i--) {
            int guess = sc.nextInt();
            if (theRandomNumber == guess){
                System.out.println("Your guess is right !");
                return;
            } else if (guess > theRandomNumber && i > 1){
                System.out.println("Too high! You have " + (i - 1) + " life left");
            } else if (guess < theRandomNumber && i > 1){
                System.out.println("Too low! You have " + (i - 1) + " life left");
            }
        }
        System.out.println("You lost all of your life. The number was " + theRandomNumber);
    }
}
