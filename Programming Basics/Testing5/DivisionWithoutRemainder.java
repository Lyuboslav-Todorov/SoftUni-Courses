package Testing5;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int dividedBy2 = 0;
        int dividedBy3 = 0;
        int dividedBy4 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0){
                dividedBy2++;
            }
            if (number % 3 == 0) {
                dividedBy3++;
            }
            if (number % 4 == 0) {
                dividedBy4++;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * dividedBy2 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * dividedBy3 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * dividedBy4 / n * 100);
    }
}
