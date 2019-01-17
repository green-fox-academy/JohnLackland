import java.util.Scanner;
public class OneTwoALot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if (userInput <= 0)
            System.out.println(" Not enough");
        else if (userInput == 1)
            System.out.println("One");
        else if (userInput == 2)
            System.out.println("Two");
        else
            System.out.println("A lot");








    }
}
