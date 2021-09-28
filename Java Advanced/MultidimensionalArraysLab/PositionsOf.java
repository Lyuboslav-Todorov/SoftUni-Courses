package MultidimensionalArraysLab;


import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer rows = Integer.parseInt(scanner.nextLine().split("\\s+")[0]);

        int[][] matrix = readMatrix(rows, scanner);

        int searchedNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                if (currentNumber == searchedNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }

    }

    private static int[][] readMatrix(Integer rows, Scanner scanner) {
        int[][] matrix = new int[rows][];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(e -> Integer.parseInt(e))
                    .toArray();
        }
        return matrix;
    }
}
