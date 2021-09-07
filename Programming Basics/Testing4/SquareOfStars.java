package Testing4;

import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char star = '*';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%c ", star);
            }
            System.out.println();
        }
    }
}
