package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfRotation; i++) {
            int zeroIndex = array[0];
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[array.length - 1] = zeroIndex;
        }
        for (int number :array) {
            System.out.print(number + " ");
        }
    }
}
