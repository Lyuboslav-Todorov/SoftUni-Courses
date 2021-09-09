package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sum = 0;

        while (number != 0){
            int digit = number % 10;
            int factorial = 1;
            for (int i = digit; i > 0; i--) {
                factorial *= i;
            }
            sum +=factorial;
            number /=10;
        }
        if (startNumber == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
