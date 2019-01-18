import java.util.Scanner;

public class drawDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        String spaces = "";

        for (int a = 0; a < userInput;a++){

            for (int j = 0; j < userInput;j++){
                if (a == 0 || j == 0 || (a + 1 == userInput || j + 1 == userInput)  )
                    System.out.print("%");
                else if (a == j){
                    System.out.print("%");
                }
                else  {
                    System.out.print(" ");
                }
            }
            System.out.println();






        }











        }
    }

