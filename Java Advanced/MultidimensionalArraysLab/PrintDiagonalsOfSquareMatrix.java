package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = readMatrix(rows, scanner);

        List<Integer> firstDiagonal = new ArrayList<>();
        List<Integer> secondDiagonal = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            firstDiagonal.add(matrix[row][row]);
        }

        for (int row = matrix.length - 1; row >= 0; row--) {
            secondDiagonal.add(matrix[row][matrix.length - 1 - row]);
        }

        for (Integer number : firstDiagonal) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (Integer number : secondDiagonal) {
            System.out.print(number + " ");
        }
    }

    public static int[][] readMatrix(int rows, Scanner scanner) {
        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        return matrix;
    }
}
