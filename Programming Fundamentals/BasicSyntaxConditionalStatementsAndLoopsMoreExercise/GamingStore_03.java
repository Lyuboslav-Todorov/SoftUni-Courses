package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double totalSpend = 0;

        String command = scanner.nextLine();
        while (!command.equals("Game Time")){
            String game = command;
            switch (game){
                case "OutFall 4":
                    if (balance - totalSpend < 39.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought OutFall 4");
                        totalSpend +=39.99;
                    }
                    break;
                case "CS: OG":
                    if (balance - totalSpend < 15.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought CS: OG");
                        totalSpend +=15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if (balance - totalSpend < 19.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought Zplinter Zell");
                        totalSpend +=19.99;
                    }
                    break;
                case "Honored 2":
                    if (balance - totalSpend < 59.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought Honored 2");
                        totalSpend +=59.99;
                    }
                    break;
                case "RoverWatch":
                    if (balance - totalSpend < 29.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought RoverWatch");
                        totalSpend +=29.99;
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (balance - totalSpend < 39.99){
                        System.out.println("Too Expensive");
                    }else {
                        System.out.println("Bought RoverWatch Origins Edition");
                        totalSpend +=39.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance == totalSpend){
                System.out.println("Out of money!");
                break;
            }
            command = scanner.nextLine();
        }
        if (balance > totalSpend){
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, balance - totalSpend);
        }
    }
}
