package Testing4;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int middle = (n - 1) / 2;

        for (int i = 1; i <=  n * 2; i++) {
            System.out.print('*');
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(' ');
        }
        for (int i = 1; i <= n * 2; i++) {
            System.out.print('*');
        }
        System.out.println();



        for (int i = 1; i <= n - 2; i++) {
            System.out.print('*');
            for (int j = 0; j < (n - 1) * 2; j++) {
                System.out.print('/');
            }
            System.out.print('*');
            if (middle == i) {
                for (int j = 1; j <= n; j++) {
                    System.out.print('|');
                }
            }else{
                for (int j = 1; j <= n; j++) {
                    System.out.print(' ');
                }
            }
            System.out.print('*');
            for (int j = 0; j < (n - 1) * 2; j++) {
                System.out.print('/');
            }
            System.out.println('*');
        }


            for (int i = 1; i <= n * 2; i++) {
                System.out.print('*');
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(' ');
            }
            for (int i = 1; i <= n * 2; i++) {
                System.out.print('*');
            }

    }
}
