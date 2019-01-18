import  java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        for(int i=0;i<userInput;i++) {

            for(int j=0;j<userInput-i;j++) {
                System.out.print(" ");
            }
            for (int k = 0;k <= i;k++)
                System.out.print("$ ");

            System.out.println();
        }

    }
}
