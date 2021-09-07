package Testing4;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int col = rows; col < n  ; col++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int col = 1; col <= rows - 1 ; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int rows = 2; rows <= n ; rows++) {
            for (int col = 1; col < rows; col++) {
                System.out.print(' ');
            }
            System.out.print('*');
            for (int col = 1; col <= n - rows ; col++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
