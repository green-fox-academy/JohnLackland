import java.util.Scanner;

public class PrintTheBigger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testNumber = sc.nextInt();
        int testNumber2 = sc.nextInt();

        if (testNumber > testNumber2) {
            System.out.println("The first number is bigger.");
        }
        else if (testNumber == testNumber2) {
            System.out.println("The two number is even.");
        }
        else if (testNumber < testNumber2 ) {
            System.out.println("The second number is bigger");
        }
        else{
            System.out.println("Type some numbers, please");
        }
    }
}
