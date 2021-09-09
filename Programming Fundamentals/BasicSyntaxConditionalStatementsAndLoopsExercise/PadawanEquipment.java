package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double singleLightSaberPrice = Double.parseDouble(scanner.nextLine());
        double singleRobePrice = Double.parseDouble(scanner.nextLine());
        double singleBeltPrice = Double.parseDouble(scanner.nextLine());

        double lightSabersPrice = singleLightSaberPrice * (Math.ceil(students + students * 0.1));
        double robesPrice = students * singleRobePrice;
        double beltsPrice = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 6 != 0){
                beltsPrice+=singleBeltPrice;
            }
        }

        double totalPrice = lightSabersPrice + robesPrice + beltsPrice;

        if (budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", totalPrice - budget);
        }
    }
}
