package ConditionalStatementsAdvancedLab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        boolean isValid = city.equals("Sofia") || city.equals("Plovdiv") || city.equals("Varna");
        double commission = 0;
        double percent = 0;

        if (city.equals("Sofia")) {
            if (0 <= sales && sales <= 500) {
                percent = 0.05;
            } else if (500 < sales && sales <= 1000) {
                percent = 0.07;
            } else if (1000 < sales && sales <= 10000) {
                percent = 0.08;
            } else if (sales > 10000) {
                percent = 0.12;
            }
        } else if(city.equals("Varna")) {
            if (0 <= sales && sales <= 500) {
                percent = 0.045;
            } else if (500 < sales && sales <= 1000) {
                percent = 0.075;
            } else if (1000 < sales && sales <= 10000) {
                percent = 0.10;
            } else if (sales > 10000) {
                percent = 0.13;
            }
        } else if(city.equals("Plovdiv")) {
            if (0 <= sales && sales <= 500) {
                percent = 0.055;
            } else if (500 < sales && sales <= 1000) {
                percent = 0.08;
            } else if (1000 < sales && sales <= 10000) {
                percent = 0.12;
            } else if (sales > 10000) {
                percent = 0.145;
            }
        }
        commission = percent * sales;
        if (commission >= 0 && isValid && sales >=0){
            System.out.printf("%.2f", commission);
        } else{
            System.out.println("error");
        }
    }
}