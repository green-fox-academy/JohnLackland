import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextInt();

        if(UserInput % 2 == 0){
            System.out.println("Even");
        }
         else System.out.println("Odd");
    }

}
