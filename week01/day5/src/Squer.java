import java.util.Scanner;
public class Squer {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int userInput = sc.nextInt();

         for (int a = 0 ; a < userInput; a++){
             for(int j = 0; j < userInput ;j++){

                 if (a == 0 || j == 0  ||  a == userInput - 1 || j == userInput -1 )
                     System.out.print("%");
                 else
                     System.out.print(" ");




             }
             System.out.println();



         }
    }
}
