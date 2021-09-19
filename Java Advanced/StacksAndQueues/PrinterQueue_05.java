package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> printerTasks = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                if (printerTasks.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printerTasks.poll());
                }
            } else {
                printerTasks.offer(command);
            }
            command = scanner.nextLine();
        }
        while (!printerTasks.isEmpty()) {
            System.out.println(printerTasks.pollFirst());
        }
    }
}
