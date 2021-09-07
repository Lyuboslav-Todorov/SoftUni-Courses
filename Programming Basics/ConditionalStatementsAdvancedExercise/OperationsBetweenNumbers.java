package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double dNum1 = num1;
        double dNum2 = num2;
        double result = 0.0;


        if (operator.equals("+")){
            result = num1 + num2;
            if (result % 2 == 0){
                System.out.printf("%d + %d = %.0f - even", num1, num2, result);
            }else{
                System.out.printf("%d + %d = %.0f - odd", num1, num2, result);
            }
        }else if (operator.equals("-")){
            result = num1 - num2;
            if (result % 2 == 0){
                System.out.printf("%d - %d = %.0f - even", num1, num2, result);
            }else{
                System.out.printf("%d - %d = %.0f - odd", num1, num2, result);
            }
        }else if (operator.equals("*")){
            result = num1 * num2;
            if (result % 2 == 0){
                System.out.printf("%d * %d = %.0f - even", num1, num2, result);
            }else{
                System.out.printf("%d * %d = %.0f - odd", num1, num2, result);
            }
        }else if (operator.equals("/")){
            if (num2 == 0){
                System.out.printf("Cannot divide %d by zero", num1);
            }else{
                result = (dNum1 / dNum2);
                System.out.printf("%d / %d = %.2f",num1, num2, result);
            }
        }else if (operator.equals("%")){

            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                result = num1 % num2;
                String module = "%";
                System.out.printf("%d %s %d = %.0f", num1, module, num2, result );
            }
        }
    }
}
