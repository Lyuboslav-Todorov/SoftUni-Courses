package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder messageBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String number = scanner.nextLine();
            int numberOfDigit = number.length();
            char oneDigit = number.charAt(0);
            int mainDigit = Character.getNumericValue(oneDigit);
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9){
                offset++;
            }
            int letterIndex = (offset + numberOfDigit - 1);
            int letterCode = letterIndex + 97;
            char letter =(char) letterCode;
            if (mainDigit == 0){
                letter = 32;
            }
            messageBuilder.append(letter);
        }
        String message = messageBuilder.toString();
        System.out.println(message);
    }
}
