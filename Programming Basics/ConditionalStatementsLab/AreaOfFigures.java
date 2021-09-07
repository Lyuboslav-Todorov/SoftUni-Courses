package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Shape = scanner.nextLine();

        if (Shape.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            double area = side * side;
            System.out.printf("%.3f",area);
        } else if (Shape.equals("rectangle")) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            double area = sideA * sideB;
            System.out.printf("%.3f",area);
        } else if (Shape.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f",area);
        } else if (Shape.equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            double area = (side * height) / 2;
            System.out.printf("%.3f",area);
        }

    }
}
