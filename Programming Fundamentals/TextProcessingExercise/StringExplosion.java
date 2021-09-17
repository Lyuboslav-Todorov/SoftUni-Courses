package TextProcessingExercise;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == '>'){
                int bombSize = Character.getNumericValue(text.charAt(i + 1));
                for (int j = i; j <= i + bombSize; j++) {
                    if (text.charAt(j) == '>'){
                        builder.append('>');
                        bombSize += Character.getNumericValue(text.charAt(j + 1));
                        i++;
                    }
                }
            } else {
                builder.append(currentChar);
            }
        }
        System.out.println(builder);
    }
}
