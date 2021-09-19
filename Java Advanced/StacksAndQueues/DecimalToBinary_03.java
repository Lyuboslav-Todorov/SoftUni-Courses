package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.valueOf(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
