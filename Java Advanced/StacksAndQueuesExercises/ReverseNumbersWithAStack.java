package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> numbers = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(input[i]);
        }

        for (String number: numbers) {
            System.out.print(number + " ");
        }
    }
}
