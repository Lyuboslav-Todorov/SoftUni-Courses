package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split("\\s+")[0]);
        int cols = Integer.parseInt(input.split("\\s+")[1]);

        int[][] matrix = readIntMatrix(rows, scanner);

        int[][] maxMatrix = findMaxSum3x3Matrix(matrix);

        printMatrix(maxMatrix);


    }

    private static int[][] readIntMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }

    private static int[][] findMaxSum3x3Matrix(int[][] matrix) {
        int[][] matrixToPrint = new int[3][3];
        int maxSum = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSum = 0;

                int topLeft = matrix[row][col];
                int topMiddle = matrix[row][col + 1];
                int topRight = matrix[row][col +2];

                int midLeft = matrix[row + 1][col];
                int midMiddle = matrix[row + 1][col + 1];
                int midRight = matrix[row + 1][col + 2];

                int botLeft = matrix[row + 2][col];
                int botMiddle = matrix[row + 2][col + 1];
                int botRight = matrix[row + 2][col + 2];

                currentSum = topLeft + topMiddle + topRight + midLeft + midMiddle + midRight + botLeft + botMiddle + botRight;

                if (currentSum > maxSum){
                    maxSum = currentSum;
                    matrixToPrint = new int[][]{
                            {topLeft, topMiddle, topRight},
                            {midLeft, midMiddle, midRight},
                            {botLeft, botMiddle, botRight}
                    };
                }
            }
        }
        System.out.println("Sum = " + maxSum);
        return matrixToPrint;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
