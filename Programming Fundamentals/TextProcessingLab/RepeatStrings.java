package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] word = scanner.nextLine().split("\\s+");

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            String currentWord = word[i];
            for (int j = 1; j <= currentWord.length(); j++) {
                builder.append(currentWord);
            }
        }
        System.out.println(builder);
    }
}
