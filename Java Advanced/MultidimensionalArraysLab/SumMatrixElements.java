package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String matrixSize = scanner.nextLine();

        int[][] matrix = readMatrix(matrixSize, scanner);

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                sum += matrix[row][col];
            }
        }

        System.out.println(sum);
    }

    public static int[][] readMatrix(String matrixSize, Scanner scanner) {
        int rows = Integer.parseInt(matrixSize.split(", ")[0]);
        int cols = Integer.parseInt(matrixSize.split(", ")[1]);
        int[][] matrix = new int [rows][cols];

        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        return matrix;
    }
}

