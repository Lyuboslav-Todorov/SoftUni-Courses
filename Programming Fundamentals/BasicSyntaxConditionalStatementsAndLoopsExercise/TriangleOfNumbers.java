package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int col = 1; col <= n; col++) {
            for (int rows = 1; rows <= col; rows++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
