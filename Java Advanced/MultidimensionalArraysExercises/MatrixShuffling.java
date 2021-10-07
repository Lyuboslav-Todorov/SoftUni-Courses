package MultidimensionalArraysExercises;

import java.util.Locale;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dimensions = scanner.nextLine();

        int rows = Integer.parseInt(dimensions.split("\\s+")[0]);
        int cols = Integer.parseInt(dimensions.split("\\s+")[1]);

        String[][] matrix = readMatrix(rows, scanner);

        String command = scanner.nextLine();

        while (!command.equals("END")){
           if (!validationCommand(command, rows, cols)){
               System.out.println("Invalid input!");
               command = scanner.nextLine();
               continue;
           } else {
               String[] commandPars = command.split("\\s+");
               int row1 = Integer.parseInt(commandPars[1]);
               int col1 = Integer.parseInt(commandPars[2]);
               int row2 = Integer.parseInt(commandPars[3]);
               int col2 = Integer.parseInt(commandPars[4]);

               String element1 = matrix[row1][col1];
               String element2 = matrix[row2][col2];

               matrix[row1][col1] = element2;
               matrix[row2][col2] = element1;
           }
           printMatrix(matrix);
            command = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static boolean validationCommand(String command, int rows, int cols) {
        String[] commandPars = command.split("\\s+");

        if (!commandPars[0].equals("swap")){
            return false;
        }
        if (commandPars.length != 5){
            return false;
        }
        int row1 = Integer.parseInt(commandPars[1]);
        int col1 = Integer.parseInt(commandPars[2]);
        int row2 = Integer.parseInt(commandPars[3]);
        int col2 = Integer.parseInt(commandPars[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols){
            return false;
        }
        return true;
    }

    private static String[][] readMatrix(int rows, Scanner scanner) {
        String[][] matrix = new String[rows][];
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }


}
