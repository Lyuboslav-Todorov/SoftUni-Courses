package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class TheatrePromotion_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (day){
            case "Weekday":
                if ((age >= 0 && age <= 18) || (age <= 122 && age >=65)){
                    price = 12;
            }else if (age > 18 && age < 65){
                    price = 18;
                }
                break;
            case "Weekend":
                if ((age >= 0 && age <= 18) || (age <= 122 && age >=65)){
                    price = 15;
                }else if (age > 18 && age < 65){
                    price = 20;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18){
                    price = 5;
                }else if (age > 18 && age < 65){
                    price = 12;
                }else if (age <= 122 && age >=65){
                    price = 10;
                }
                break;
        }
        if ( price > 0){
            System.out.printf("%.0f$", price);
        }else
            System.out.println("Error!");
    }
}
