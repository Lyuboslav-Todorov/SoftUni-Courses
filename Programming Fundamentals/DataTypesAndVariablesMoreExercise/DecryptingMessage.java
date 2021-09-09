package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder messageBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            char decryptedChar = (char) (currentChar + key);
            messageBuilder.append(decryptedChar);
        }
        String message = messageBuilder.toString();
        System.out.println(message);
    }
}
