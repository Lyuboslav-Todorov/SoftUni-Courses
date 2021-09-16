package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            StringBuilder stars = new StringBuilder();
            String currentWord = bannedWords[i];
            for (int j = 0; j < currentWord.length(); j++) {
                stars.append("*");
            }
            text = text.replace(currentWord, stars);
        }

        System.out.println(text);
    }
}
