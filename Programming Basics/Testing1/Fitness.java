package Testing1;

import java.util.Scanner;

public class Fitness {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double prize = 0.0d;

        if (gender == 'm') {
            switch(sport){
                case "Gym":prize = 42;break;
                case "Boxing":prize = 41;break;
                case "Yoga":prize = 45;break;
                case "Zumba":prize = 34;break;
                case "Dances":prize = 51;break;
                case "Pilates":prize = 39;break;
            }
        } else {
            switch(sport){
                case "Gym":prize = 35;break;
                case "Boxing":prize = 37;break;
                case "Yoga":prize = 42;break;
                case "Zumba":prize = 31;break;
                case "Dances":prize = 53;break;
                case "Pilates":prize = 37;break;
            }
        }
        if(age < 20){
            prize = prize * 0.8;
        }
        if (sum >= prize) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.",(prize - sum));
        }
    }
}
