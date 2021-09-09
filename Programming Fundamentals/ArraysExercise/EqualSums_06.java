package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean isEqual = false;

        for (int index = 0; index < array.length; index++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += array[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < array.length; rightIndex++) {
                rightSum += array[rightIndex];
            }
            if (rightSum == leftSum) {
                System.out.println(index);
                isEqual = true;
                break;
            }
        }
        if (!isEqual) {
            System.out.print("no");
        }
    }
}
