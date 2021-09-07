package NestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String destination = command;
            int budget = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            while (sum < budget){
                int saving = Integer.parseInt(scanner.nextLine());
                sum += saving;
            }

            System.out.printf("Going to %s!%n", destination);
            command = scanner.nextLine();
        }

    }
}
