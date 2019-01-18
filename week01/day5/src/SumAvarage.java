import java.util.Scanner;

public class SumAvarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int summ = 0;
        boolean win = true;

        while (win){

            int userInput = sc.nextInt();

            summ += userInput;
            a++;
            System.out.println("Sum = " + summ + ", Avarage: " + summ / a);










        }







    }
}
