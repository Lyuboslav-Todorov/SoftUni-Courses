package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();
            if (command.equals("2")){
                stack.pop();
            } else if (command.equals("3")){
                System.out.println(Collections.max(stack));
            } else {
                String[] tokens = command.split("\\s+");
                int number = Integer.parseInt(tokens[1]);
                stack.push(number);
            }
        }
    }
}
