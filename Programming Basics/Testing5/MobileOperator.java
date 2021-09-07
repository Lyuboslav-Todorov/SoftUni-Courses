package Testing5;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contractTerm = scanner.nextLine();
        String contractType = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());

        double pricePerMonth = 0;

        if (contractTerm.equals("one")){
            switch (contractType){
                case "Small": pricePerMonth = 9.98;
                break;
                case "Middle": pricePerMonth = 18.99;
                break;
                case "Large": pricePerMonth = 25.98;
                break;
                case "ExtraLarge": pricePerMonth = 35.99;
                break;
            }

        }else if (contractTerm.equals("two")){
            switch (contractType){
                case "Small": pricePerMonth = 8.58;
                    break;
                case "Middle": pricePerMonth = 17.09;
                    break;
                case "Large": pricePerMonth = 23.59;
                    break;
                case "ExtraLarge": pricePerMonth = 31.79;
                    break;
            }
        }

        if (mobileInternet.equals("yes")){
            if (pricePerMonth <= 10){
                pricePerMonth += 5.5;
            }else if (pricePerMonth <= 30){
                pricePerMonth += 4.35;
            }else {
                pricePerMonth += 3.85;
            }
        }

        if (contractTerm.equals("two")){
            pricePerMonth -= pricePerMonth * 0.0375;
        }

        double totalPrice = pricePerMonth * months;

        System.out.printf("%.2f lv.", totalPrice);

    }
}
