package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder reversesBuilder = new StringBuilder();

        for (int position = input.length() - 1; position >= 0; position--) {
           // char currentChar = input.charAt(position);
            //reversesBuilder.append(currentChar);
            reversesBuilder.append(input.charAt(position));
        }
        String reverses = reversesBuilder.toString();
        System.out.println(reverses);
    }
}
