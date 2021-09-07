package NestedLoopsExercise;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean isReached = false;

        for (int rows = 1; rows <= n ; rows++) {
            for (int col = 1; col <= rows; col++) {
                counter++;
                System.out.printf("%d ", counter);
                if (counter == n){
                    isReached = true;
                    break;
                }
            }
            if (isReached){
                break;
            }
            System.out.println();
        }
    }
}