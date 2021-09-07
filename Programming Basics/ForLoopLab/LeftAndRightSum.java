package ForLoopLab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i <= n ; i++) {
            int leftN = Integer.parseInt(scanner.nextLine());
            sumLeft += leftN;
        }
        for (int i = 1; i <= n ; i++) {
            int rightN = Integer.parseInt(scanner.nextLine());
            sumRight += rightN;
        }
        if (sumLeft == sumRight) {
            System.out.printf("Yes, sum = %d", sumLeft);
        }else{
            System.out.printf("No, diff = %d", Math.abs(sumLeft - sumRight));
        }
    }
}
