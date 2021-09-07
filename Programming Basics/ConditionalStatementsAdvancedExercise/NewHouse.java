package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double result = 0.0;

        if (flower.equals("Roses")){
            price = num * 5.00;
            if (num > 80){
                price = price - price * 0.10;
            }
        } else if (flower.equals("Dahlias")){
            price = num * 3.80;
            if (num > 90){
                price = price - price * 0.15;
            }
        } else if (flower.equals("Tulips")){
            price = num * 2.80;
            if (num > 80){
                price = price - price * 0.15;
            }
        } else if (flower.equals("Narcissus")){
            price = num * 3.00;
            if (num < 120){
                price = price + price * 0.15;
            }
        }else if (flower.equals("Gladiolus")){
            price = num * 2.50;
            if (num < 80){
                price = price + price * 0.20;
            }
        }
        result = Math.abs(budget - price);
        if (budget >= price){

            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, flower,result );
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.", result);
        }

    }
}
