package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            boolean isGreater = false;
            for (int compareIndex = currentIndex + 1; compareIndex < array.length; compareIndex++) {
                if (array[currentIndex] > array[compareIndex]) {
                    isGreater = true;
                } else {
                    isGreater = false;
                    break;
                }
            }
            if (isGreater){
                System.out.print(array[currentIndex] + " ");
            }
        }
        System.out.print(array[array.length - 1]);
    }
}
