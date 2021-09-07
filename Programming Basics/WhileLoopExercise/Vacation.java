package WhileLoopExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double moneySaved = Double.parseDouble(scanner.nextLine());

        int spendingDays = 0;
        int totalDays = 0;
        boolean isSaved = false;

        while (spendingDays < 5){
            String moneyFlow = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDays++;
            if (moneyFlow.equals("save")){
                moneySaved += money;
                if (moneySaved >= moneyNeeded){
                    isSaved = true;
                    break;
                }
                spendingDays = 0;
            }else if(moneyFlow.equals("spend")){
                moneySaved -= money;
                if (moneySaved < 0){
                    moneySaved = 0;
                }
                spendingDays++;
            }
        }
        if (isSaved){
            System.out.printf("You saved the money for %d days.", totalDays);
        }else{
            System.out.printf("You can't save the money.%n%d", totalDays);
        }
    }
}
