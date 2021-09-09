package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int[] train = new int[wagons];


        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int number: train) {
            System.out.printf("%d ", number);
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
