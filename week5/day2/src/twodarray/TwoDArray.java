package twodarray;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Arrays.stream(rotatedMatrix(matrix)).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    public static int[][] rotatedMatrix(int[][] matrix) {
        int[][] newArray = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix.length; column++) {
                newArray[row][column] = matrix[matrix.length-1-column][row];
            }
        }

        return newArray;
    }

}
