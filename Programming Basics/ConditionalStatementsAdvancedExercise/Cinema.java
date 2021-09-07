package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double result = 0;

        if (type.equals("Premiere")){
            result = (rows * columns) * 12.00;
        } else if (type.equals("Normal")){
            result = (rows * columns) * 7.50;
        } else if (type.equals("Discount")){
            result = (rows * columns) * 5.00;
        }
        System.out.printf("%.2f leva", result);
    }
}
