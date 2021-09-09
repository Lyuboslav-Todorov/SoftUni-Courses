package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int openingBrackets = 0;
        int closingBrackets = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            if (input.equals("(")) {
                openingBrackets++;
            }
            if (input.equals(")")) {
                closingBrackets++;
            }
            if (closingBrackets > openingBrackets){
                break;
            }
        }
        if (openingBrackets != closingBrackets){
            isBalanced = false;
        }
        if (isBalanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
