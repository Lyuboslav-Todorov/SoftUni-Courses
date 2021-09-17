package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);

        for (int index = 0; index < builder.length() -1; index++) {
            if (builder.charAt(index) == builder.charAt(index + 1)){
                builder.deleteCharAt(index + 1);
                index--;
            }
        }
        System.out.println(builder);
    }
}
