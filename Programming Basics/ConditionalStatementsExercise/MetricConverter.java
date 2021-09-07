package ConditionalStatementsExercise;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();
        double result = 0;

        if (input.equals("m")){
            result = num * 1000;
        } else if (input.equals("cm")){
            result = num * 10;
        } else if (input.equals("mm")){
            result = num * 1;
        }
        if (output.equals("m")){
            result = result / 1000;
        } else if (output.equals("cm")){
            result = result / 10;
        }

        System.out.printf("%.3f", result);
    }
}
