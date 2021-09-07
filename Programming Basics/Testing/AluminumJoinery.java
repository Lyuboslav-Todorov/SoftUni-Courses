package Testing;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String kind = scanner.nextLine();
        String delivery = scanner.nextLine();

        double priceForOneCount = 0;

        if (kind.equals("90X130")){
            if (count > 60){
                priceForOneCount = 110 - 110 * 0.08;
            }else if (count > 30){
                priceForOneCount = 110 - 110 * 0.05;
            }else{
                priceForOneCount = 110;
            }

        }else if (kind.equals("100X150")){
            if (count > 80){
                priceForOneCount = 140 - 140 * 0.10;
            }else if (count > 40){
                priceForOneCount = 140 - 140 * 0.06;
            }else {
                priceForOneCount = 140;
            }
        }

        else if (kind.equals("130X180")){
            if (count > 50){
                priceForOneCount = 190 - 190 * 0.12;
            }else if (count > 20){
                priceForOneCount = 190 - 190 * 0.07;
            }else {
                priceForOneCount = 190;
            }
        }

        else if (kind.equals("200X300")){
            if (count > 50){
                priceForOneCount = 250 - 250 * 0.14;
            }else if (count > 25){
                priceForOneCount = 250 - 250 * 0.09;
            }else {
                priceForOneCount = 250;
            }
        }

        double priceForAllJoinery = priceForOneCount * count;
        if (delivery.equals("With delivery")){
            priceForAllJoinery += 60;
        }

        if (count > 99){
            priceForAllJoinery = priceForAllJoinery - priceForAllJoinery * 0.04;
        }

        if (count < 10){
            System.out.println("Invalid order");
        }else{
            System.out.printf("%.2f BGN", priceForAllJoinery);
        }

    }
}
