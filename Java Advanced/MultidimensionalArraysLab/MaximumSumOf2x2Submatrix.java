package MultidimensionalArraysLab;


import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().split(", ")[0]);

        int[][] matrix = readMatrix(rows, scanner, ", ");

        int[][] maxMatrix = new int[2][2];
        int matrixSum = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                int topLeft = matrix[row][col];
                int topRight = matrix[row][col + 1];
                int leftBottom = matrix[row + 1][col];
                int rightBottom = matrix[row + 1][col + 1];
                int currentMatrixSum = topLeft + topRight + leftBottom + rightBottom;
                if (currentMatrixSum > matrixSum){
                    matrixSum = currentMatrixSum;
                    maxMatrix = new int[][] {
                            {topLeft, topRight},
                            {leftBottom, rightBottom}
                    };
                }
            }
        }

        printMatrix(maxMatrix);
        System.out.println(matrixSum);
    }

    public static void printMatrix(int[][] maxMatrix) {
        for (int row = 0; row < maxMatrix.length; row++) {
            for (int col = 0; col < maxMatrix[0].length; col++) {
                System.out.print(maxMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] readMatrix(int rows, Scanner scanner, String splitPattern) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(splitPattern))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
