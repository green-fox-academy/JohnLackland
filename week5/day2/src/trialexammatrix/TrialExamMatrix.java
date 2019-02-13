package trialexammatrix;

import java.util.Arrays;

public class TrialExamMatrix {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {0, 0, 0, 0},
                {9, 0, 9, 0}
        };
        int[][] matrix2 = {
                {7, 2, 8, 4},
                {4, 3, 1, 1},
                {9, 0, 4, 0},
                {9, 0, 9, 1}
        };
        int[][] matrix3 = {
                {1, 2, 3},
                {4, 3, 2},
                {0, 0, 0},
        };
        int[][] matrix4 = {
                {7, 2, 8},
                {4, 3, 1},
                {9, 0, 4},
        };
        Arrays.stream(returnTheBiggerValues(matrix1, matrix2)).forEach(row -> System.out.println(Arrays.toString(row)));
        System.out.println();
        Arrays.stream(returnTheBiggerValues(matrix3, matrix4)).forEach(row -> System.out.println(Arrays.toString(row)));

    }

    private static int[][] returnTheBiggerValues(int[][] matrix1, int[][] matrix2) {
        int[][] something = new int[matrix1.length][matrix1.length];

        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1.length; column++) {
                something[row][column] = Integer.max(matrix1[row][column], matrix2[row][column]);
            }
        }
        return something;
    }
}
