package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int counterLongestSequence = 1;
        int counterCurrentSequence = 1;
        int longestSequenceNumber = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counterCurrentSequence++;
            }
            if (counterLongestSequence < counterCurrentSequence) {
                counterLongestSequence = counterCurrentSequence;
                longestSequenceNumber = numbers[i];
            }
            if (numbers[i] != numbers[i + 1]) {
                counterCurrentSequence = 1;
            }
        }
        for (int i = 1; i <= counterLongestSequence; i++) {
            System.out.print(longestSequenceNumber + " ");
        }
    }
}
