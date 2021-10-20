package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> minesResources = new LinkedHashMap<>();


        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!minesResources.containsKey(resource)){
                minesResources.put(resource, quantity);
            } else {
                minesResources.put(resource, minesResources.get(resource) + quantity);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : minesResources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
