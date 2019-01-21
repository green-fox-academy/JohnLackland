import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[][] first = new int[a][a];


        for (int i = 0; i < a; i++) {

            for (int k = 0; k < a; k++) {

                first[i][k] = 0;

                first[i][i] = 1;

                System.out.print(first[i][k]);
            }
            System.out.println();
        }


    }
}
