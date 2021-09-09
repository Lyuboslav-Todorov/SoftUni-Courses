package DataTypesAndVariablesMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            long[] numbers = Arrays.stream(inputArray).mapToLong(e -> Long.parseLong(e)).toArray();
            long numbersSum = 0;

            if (numbers[0] > numbers[1]){
                long currentNumber = numbers[0];
                while (currentNumber != 0){
                    numbersSum+=currentNumber % 10;
                    currentNumber/=10;
                }
            }else{
                long currentNumber= numbers[1];
                while (currentNumber != 0){
                    numbersSum+=currentNumber % 10;
                    currentNumber/=10;
                }
            }
            System.out.println(Math.abs(numbersSum));
        }

    }
}
