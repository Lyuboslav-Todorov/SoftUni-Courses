package workingWithAbstractionLab.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectangleCoordinates = readArray(scanner);

        Point pointA = new Point(rectangleCoordinates[0], rectangleCoordinates[1]);
        Point pointC = new Point(rectangleCoordinates[2], rectangleCoordinates[3]);
        Rectangle rectangle = new Rectangle(pointA, pointC);

        int pointsCount = Integer.parseInt(scanner.nextLine());

        while (pointsCount-- > 0 ){
            int[]tokens = readArray(scanner);
            Point currentPoint = new Point(tokens[0], tokens[1]);

            boolean isInside = rectangle.isInside(currentPoint);
            System.out.println(isInside);
        }

    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

}
