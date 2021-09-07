package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double depositedAmount = Double.parseDouble(scan.nextLine());
        int depositTerm = Integer.parseInt(scan.nextLine());
        Double annualInterestRate = Double.parseDouble(scan.nextLine());
        Double sum = depositedAmount + depositTerm * ((depositedAmount * (annualInterestRate / 100))/12);
        System.out.println(sum);
    }
}
