package Testing4;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int upperLimit1 = Integer.parseInt(scanner.nextLine());
        int upperLimit2 = Integer.parseInt(scanner.nextLine());
        int upperLimit3 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= upperLimit1; i++) {
            for (int j = 1; j <= upperLimit2; j++) {
                boolean isPrime = false;
                int counter = 0;
                for (int l = 1; l < j ; l++) {
                    if (j % l == 0){
                        counter++;
                    }
                }
                if (counter == 1){
                    isPrime = true;
                }
                for (int k = 1; k <= upperLimit3 ; k++) {
                    if (i % 2 == 0 && isPrime && k % 2 == 0) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
