package MultidimensionalArraysExercises;

import java.util.Scanner;


public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int rows = Integer.parseInt(input.split(", ")[0]);
        String pattern = input.split(", ")[1];

        int[][] matrix = new int[rows][rows];

        if (pattern.equals("A")) {
            fillPatternAMatrix(matrix);
        } else if (pattern.equals("B")) {
            fillPatternBMatrix(matrix);
        }

        printMatrix(matrix);
    }

    public static void fillPatternAMatrix(int[][] matrix) {
        int numberToFill = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = numberToFill++;
            }
        }
    }

    public static void fillPatternBMatrix(int[][] matrix) {
        int numberToFill = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = numberToFill++;
                }
            } else {
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = numberToFill++;
                }
            }
        }
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
