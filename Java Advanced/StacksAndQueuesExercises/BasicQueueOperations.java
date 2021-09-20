package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int elementsToRemove = scanner.nextInt();
        int numberToCheck = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int currentNumber = scanner.nextInt();
            queue.offer(currentNumber);
        }

        for (int i = 1; i <= elementsToRemove; i++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println(0);
        } else {
            if (queue.contains(numberToCheck)){
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
