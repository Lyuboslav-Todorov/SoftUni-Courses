package Testing1;

import java.util.Scanner;

public class ChangeBureau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chinese = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());


        double sumInLv = bitcoins * 1168 + chinese * 0.15 * 1.76;
        double sumInEuro = sumInLv / 1.95;
        double moneyForTravel = sumInEuro - (sumInEuro * commission * 0.01);
        System.out.printf("%.2f", moneyForTravel);
    }
}
