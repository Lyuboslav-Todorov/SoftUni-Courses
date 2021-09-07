package WhileLoopExercise;

import java.util.Scanner;

public class Vacation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());

        int spendingDays = 0;
        int totalDays = 0;

        while (spendingDays < 5 && savedMoney < neededMoney){
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            totalDays++;
            if ("save".equals(command)){
                savedMoney += money;
                spendingDays = 0;
            }else if("spend".equals(command)){
                savedMoney -= money;
                spendingDays+= 1;
                if (savedMoney < 0){
                    savedMoney = 0;
                }
            }
        }
        if (spendingDays == 5){
            System.out.println("You can't save the money.");
            System.out.println(spendingDays);
        }
        if (savedMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", totalDays);
        }
    }
}
