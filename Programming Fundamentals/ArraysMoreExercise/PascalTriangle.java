package ArraysMoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] startingNumbers = new int[n + 1];
        startingNumbers[1] = 1;
        int arrayCounter = 1;

        for (int i = 1; i <= startingNumbers.length; i++) {
            int[] currentNumbers = new int[i];
            for (int j = 0; j < currentNumbers.length; j++) {
                currentNumbers[j] = startingNumbers[arrayCounter] + startingNumbers[arrayCounter + 1];
                startingNumbers[arrayCounter] = currentNumbers[j];
                arrayCounter++;
                System.out.print(startingNumbers[arrayCounter] + " ");
            }

            arrayCounter = 1;

            System.out.println();
        }

    }
}
