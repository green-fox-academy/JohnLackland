import  java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        int firstNumber = sc01.nextInt();
        int secondNumber = sc01.nextInt();

        if(secondNumber > firstNumber) {

            while (secondNumber >= firstNumber) {
                System.out.println(firstNumber);
                firstNumber++;
            }
        }
        else System.out.println("The second number should be bigger");



    }
}
