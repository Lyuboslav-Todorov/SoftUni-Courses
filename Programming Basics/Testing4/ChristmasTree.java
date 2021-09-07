package Testing4;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


            for (int j = 0; j <= n; j++) {
                for (int k = 1; k <= n - j ; k++) {
                    System.out.print(' ');
                }
                for (int k = 0; k < j; k++) {
                    System.out.print('*');
                }
                System.out.print(" | ");
                for (int k = 0; k < j; k++) {
                    System.out.print('*');
                }
                System.out.println();
            }
        
    }
}
