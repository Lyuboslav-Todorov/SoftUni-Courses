package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();

        double singlePersonPrice = 0;

        switch (groupType){
            case "Students":
                switch (day){
                    case "Friday":
                        singlePersonPrice = 8.45;
                        break;
                    case "Saturday":
                        singlePersonPrice = 9.80;
                        break;
                    case "Sunday":
                        singlePersonPrice = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        singlePersonPrice = 10.90;
                        break;
                    case "Saturday":
                        singlePersonPrice = 15.60;
                        break;
                    case "Sunday":
                        singlePersonPrice = 16;
                        break;
                }
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        singlePersonPrice = 15;
                        break;
                    case "Saturday":
                        singlePersonPrice = 20;
                        break;
                    case "Sunday":
                        singlePersonPrice = 22.50;
                        break;
                }
                break;
        }
        double totalPrice = people * singlePersonPrice;

        if (groupType.equals("Students") && people >= 30){
            totalPrice *= 0.85;
        }
        if (groupType.equals("Business") && people >= 100){
            totalPrice = (people - 10) * singlePersonPrice;
        }
        if (groupType.equals("Regular") && people >= 10 && people <= 20){
            totalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
