package Testing1;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double priceForOneSet = 0;

        if (fruit.equals("Watermelon")){
            if (size.equals("small")){
                priceForOneSet = 56 * 2;
            }else if (size.equals("big")){
                priceForOneSet = 28.70 * 5;
            }
        } else if (fruit.equals("Mango")) {
            if (size.equals("small")){
                priceForOneSet = 36.66 * 2;
            }else if (size.equals("big")){
                priceForOneSet = 19.60 * 5;
            }
        }else if (fruit.equals("Pineapple")) {
            if (size.equals("small")){
                priceForOneSet = 42.10 * 2;
            }else if (size.equals("big")){
                priceForOneSet = 24.80 * 5;
            }
        }else if (fruit.equals("Raspberry")) {
            if (size.equals("small")){
                priceForOneSet = 20 * 2;
            }else if (size.equals("big")){
                priceForOneSet = 15.20 * 5;
            }
        }
        double priceForAllSets = priceForOneSet * count;
        if (priceForAllSets > 1000){
            priceForAllSets = priceForAllSets - priceForAllSets * 0.50;
        }else if (priceForAllSets >= 400){
            priceForAllSets = priceForAllSets - priceForAllSets * 0.15;
        }
        System.out.printf("%.2f lv.", priceForAllSets);
    }
}
