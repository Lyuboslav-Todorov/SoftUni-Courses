package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadset = lostGames / 2;
        int brokenMouse = lostGames / 3;
        int brokenKeyboard = lostGames / 6;
        int brokenDisplay = lostGames / 12;

        double totalPrice = brokenHeadset * headsetPrice + brokenMouse * mousePrice + keyboardPrice * brokenKeyboard+
                brokenDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
