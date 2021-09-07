package ConditionalStatementsExercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sumTime = first + second + third;

        int min = sumTime / 60;
        int seconds = sumTime % 60;

        System.out.printf("%d:%02d", min, seconds);

    }
}
