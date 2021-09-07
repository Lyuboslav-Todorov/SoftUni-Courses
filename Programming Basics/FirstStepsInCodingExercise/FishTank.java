package FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeInCm3 = length * width * height;
        double volumeInLiters = volumeInCm3 * 0.001;
        double neededLiters = volumeInLiters - (volumeInLiters * percent / 100);
        System.out.printf("%.2f", neededLiters);

    }
}
