package ForLoopLab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double laundryPrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int evenMoney = 0;
        int savedMoney = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 != 0){
                savedMoney += toyPrice;
            }else{
                evenMoney += 10;
                savedMoney += evenMoney -1;
            }
        }
        double difference = Math.abs(savedMoney - laundryPrice);
        if (savedMoney >= laundryPrice){
            System.out.printf("Yes! %.2f", difference);
        }else{
            System.out.printf("No! %.2f", difference);
        }
    }
}
