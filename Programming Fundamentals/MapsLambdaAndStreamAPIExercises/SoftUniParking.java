package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> registeredPeople = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]){
                case "register":
                    if (!registeredPeople.containsKey(command[1])) {
                        registeredPeople.put(command[1], command[2]);
                        System.out.printf("%s registered %s successfully%n", command[1], command[2]);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", command[2]);
                    }
                    break;
                case "unregister":
                    if (registeredPeople.containsKey(command[1])) {
                        registeredPeople.remove(command[1]);
                        System.out.printf("%s unregistered successfully%n", command[1]);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", command[1]);
                    }
                    break;
            }
        }
        registeredPeople.entrySet().forEach(entry -> System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
    }
}
