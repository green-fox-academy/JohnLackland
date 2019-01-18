import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        String test = "*";

        for (int a = 1;a <= userInput; a++){
            System.out.println("*".repeat(a));


        }
    }
}
