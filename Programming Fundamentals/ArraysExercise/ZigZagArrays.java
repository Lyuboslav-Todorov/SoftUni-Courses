package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {
            int[] currentNumber = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            if (i % 2 == 0){
                firstArray[i] = currentNumber[0];
                secondArray[i] = currentNumber[1];
            }else{
                firstArray[i] = currentNumber[1];
                secondArray[i] = currentNumber[0];
            }
        }
        for (int first : firstArray) {
            System.out.print(first + " ");
        }
        System.out.println();
        for (int second : secondArray) {
            System.out.print(second + " ");
        }
    }
}
