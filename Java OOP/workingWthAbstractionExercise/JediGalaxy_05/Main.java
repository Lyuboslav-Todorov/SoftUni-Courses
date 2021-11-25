package workingWthAbstractionExercise.JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = readPositions(scanner.nextLine());

        int rows = dimension[0];
        int cols = dimension[1];

        Field field = new Field(rows, cols);
        Galaxy galaxy = new Galaxy(field);


        String command = scanner.nextLine();
        long collectedStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPosition = readPositions(command);
            int[] evil = readPositions(scanner.nextLine());
            int rowEvil = evil[0];
            int colEvil = evil[1];
            galaxy.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPosition[0];
            int colJedi = jediPosition[1];

            collectedStars += galaxy.moveJedi(rowJedi, colJedi);

            command = scanner.nextLine();
        }

        System.out.println(collectedStars);


    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
