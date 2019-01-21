import java.util.Scanner;
public class diamond  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        int helpingIntSpaces = (userInput +1)/2;
        int helpingIntStars = 0;

        for (int i = 0; i < userInput; i++) {
            if (helpingIntStars <= userInput) {

                for (int j = 0; j < userInput - i; j++){
                System.out.print(" ");
                }

                for (int k = 0; k <= helpingIntStars; k++) {

                    System.out.print("*");
                }

                helpingIntStars += 2;
                System.out.println();
            }
        }
        helpingIntStars -= 2;


        for (int i = userInput - helpingIntSpaces; i > 0; i--) {

            for (int j = 0; j <= userInput-i ; j++){
                System.out.print(" ");
            }

         helpingIntStars -= 2;

         if (helpingIntSpaces < userInput) {

             for (int k = 0; k <= helpingIntStars; k++) {
                 System.out.print("*");
             }

             System.out.println();
         }
        }
        }



        }












