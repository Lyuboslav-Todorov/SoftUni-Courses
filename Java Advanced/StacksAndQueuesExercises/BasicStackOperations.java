package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersToPush = scanner.nextInt();
        int timesToPop = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 1; i <= numbersToPush; i++) {
            int number = scanner.nextInt();
            numbers.push(number);
        }

        for (int i = 1; i <= timesToPop; i++) {
            numbers.pop();
        }

        if (numbers.contains(numberToCheck)){
            System.out.println("true");
        } else if (numbers.isEmpty()){
            System.out.println(0);
        } else {
            System.out.println(Collections.min(numbers));
        }
    }
}
