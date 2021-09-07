package Testing1;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double sumForCard = 0;

        if (gender.equals("m")) {
            switch (sport) {
                case "Gym":
                    sumForCard = 42;
                    break;
                case "Boxing":
                    sumForCard = 41;
                    break;
                case "Yoga":
                    sumForCard = 45;
                    break;
                case "Zumba":
                    sumForCard = 34;
                    break;
                case "Dances":
                    sumForCard = 51;
                    break;
                case "Pilates":
                    sumForCard = 39;
                    break;
            }
        }else if (gender.equals("f")){
                switch (sport){
                    case "Gym":
                        sumForCard = 35;
                        break;
                    case "Boxing":
                        sumForCard = 37;
                        break;
                    case "Yoga":
                        sumForCard = 42;
                        break;
                    case "Zumba":
                        sumForCard = 31;
                        break;
                    case "Dances":
                        sumForCard = 53;
                        break;
                    case "Pilates":
                        sumForCard = 37;
                        break;
                }
            }



        if (age <= 19){
            sumForCard -= sumForCard * 0.2;
        }
        if (sum >= sumForCard){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else{
            System.out.printf("You don't have enough money! You need $%.2f more.", sumForCard - sum);
        }
    }
}
