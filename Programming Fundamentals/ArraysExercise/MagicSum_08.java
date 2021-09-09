package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int firstNumber = 0; firstNumber < numbers.length - 1; firstNumber++) {
            for (int secondNumber = firstNumber + 1; secondNumber < numbers.length; secondNumber++) {
                if (numbers[firstNumber] + numbers[secondNumber] == magicNumber) {
                    System.out.println(numbers[firstNumber] + " " + numbers[secondNumber]);
                }
            }
        }
    }
}
