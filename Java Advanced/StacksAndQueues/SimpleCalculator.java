package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();

        Collections.addAll(numbers, tokens);

        while (numbers.size() > 1){
            int first = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int second = Integer.parseInt(numbers.pop());

            switch (operator) {
                case "+": numbers.push(String.valueOf(first + second));
                break;
                case "-": numbers.push(String.valueOf(first - second));
                break;
            }
        }
        System.out.println(numbers.pop());
    }
}
