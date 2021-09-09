package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandStart = scanner.nextLine();

        double totalSum = 0;

        while (!commandStart.equals("Start")){
            double coin = Double.parseDouble(commandStart);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2){
                totalSum+=coin;
            }else{
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            commandStart = scanner.nextLine();
        }
        String commandEnd = scanner.nextLine();

        while (!commandEnd.equals("End")){
            String product = commandEnd;
            switch (product){
                case "Nuts":
                    if (totalSum >= 2.0) {
                        System.out.printf("Purchased %s%n", product);
                        totalSum -= 2.0;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Water":
                    if (totalSum >= 0.7) {
                        System.out.printf("Purchased %s%n", product);
                        totalSum -= 0.7;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Crisps":
                    if (totalSum >= 1.5) {
                        System.out.printf("Purchased %s%n", product);
                        totalSum -= 1.5;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Soda":
                    if (totalSum >= 0.8) {
                        System.out.printf("Purchased %s%n", product);
                        totalSum -= 0.8;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }break;
                case "Coke":
                    if (totalSum >= 1.0) {
                        System.out.printf("Purchased %s%n", product);
                        totalSum -= 1.0;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            commandEnd = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalSum);
    }
}
