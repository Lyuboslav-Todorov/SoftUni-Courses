package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int count = Integer.valueOf(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();

        for (String child : children) {
            kids.offer(child);
        }

        while (kids.size() > 1) {
            for (int i = 1; i < count; i++) {
                kids.offer(kids.poll());
            }
            System.out.println("Removed " + kids.poll());
        }

        System.out.println("Last is " + kids.poll());


    }
}
