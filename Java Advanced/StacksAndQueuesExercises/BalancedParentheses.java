package StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String parenthesis = scanner.nextLine();
        boolean areBalanced = false;

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < parenthesis.length(); i++) {
            char currentChar = parenthesis.charAt(i);
            if (currentChar == '{' || currentChar == '[' || currentChar == '(') {
                stack.push(currentChar);
            } else {
                if (!stack.isEmpty()) {
                    if (currentChar == '}' && stack.peek() == '{') {
                        areBalanced = true;
                        stack.pop();
                    } else if (currentChar == ']' && stack.peek() == '[') {
                        areBalanced = true;
                        stack.pop();
                    } else if (currentChar == ')' && stack.peek() == '(') {
                        areBalanced = true;
                        stack.pop();
                    } else {
                        areBalanced = false;
                        break;
                    }
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

