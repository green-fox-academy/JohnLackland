import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        String help ="*";

        for (int i = 0; i < userInput; i++){

            for (int k = 0; k < userInput -i;k++){
                System.out.print(" ");
            }
            for(int j =0; j <= i; j++ ){
                System.out.println();
            }



            System.out.println();

        }




    }
}
