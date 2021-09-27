package MultidimensionalArraysLab;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(rows, cols, scanner);
        char[][] secondMatrix = readMatrix(rows, cols, scanner);
        char[][] thirdMatrix = newMatrix(firstMatrix, secondMatrix, rows, cols);

        for (int row = 0; row < thirdMatrix.length; row++) {
            for (int col = 0; col < thirdMatrix[row].length; col++) {
                System.out.print(thirdMatrix[row][col] + " ");
            }
            System.out.println();
        }


    }

    public static char[][] newMatrix(char[][] firstMatrix, char[][] secondMatrix,int rows, int cols) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < firstMatrix.length; row++) {
            for (int col = 0; col < firstMatrix[row].length; col++) {
                if (firstMatrix[row][col] == secondMatrix[row][col]){
                    matrix[row][col] = firstMatrix[row][col];
                } else {
                    matrix[row][col] = '*';
                }
            }
        }


        return matrix;
    }

    public static char[][] readMatrix(int rows,int cols, Scanner scanner) {
        char[][] matrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            String[] elements = line.split("\\s+");
            for (int i = 0; i < elements.length; i++) {
                char current = elements[i].charAt(0);
                matrix[row][i] = current;
            }
        }
        return matrix;
    }
}
