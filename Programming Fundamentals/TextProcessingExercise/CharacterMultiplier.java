package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");
        char[] firstWord = words[0].toCharArray();
        char[] secondWord = words[1].toCharArray();

        long sum = 0;

        int shorterWord = Math.min(firstWord.length, secondWord.length);

        for (int i = 0; i < shorterWord; i++) {
            long firstNumber = firstWord[i];
            long secondNumber = secondWord[i];
            sum += firstNumber * secondNumber;
        }

        if (firstWord.length > secondWord.length){
            for (int i = secondWord.length; i < firstWord.length; i++) {
                sum += firstWord[i];
            }
        }
        if (firstWord.length < secondWord.length){
            for (int i = firstWord.length; i < secondWord.length; i++) {
                sum += secondWord[i];
            }
        }

        System.out.println(sum);
    }
}
