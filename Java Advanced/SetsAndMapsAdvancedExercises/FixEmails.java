package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, String> emailData = new LinkedHashMap<>();

        while (!command.equals("stop")){
            String name = command;
            String email = scanner.nextLine();
            if (!email.endsWith("com") && !email.endsWith("uk") && !email.endsWith("us")){
                emailData.put(name, email);
            }
            command = scanner.nextLine();
        }

        emailData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
