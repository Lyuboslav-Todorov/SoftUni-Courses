package SetsAndMapsAdvancedExercises;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String addCommand = scanner.nextLine();

        Map<String, String> phonebook =  new HashMap<>();

        while (!addCommand.equals("search")){
            String name = addCommand.split("-")[0];
            String number = addCommand.split("-")[1];
            phonebook.put(name, number);
            addCommand = scanner.nextLine();
        }

        String callCommand = scanner.nextLine();

        while (!callCommand.equals("stop")){
            if (phonebook.containsKey(callCommand)){
                System.out.println(callCommand + " -> " + phonebook.get(callCommand));
            } else {
                System.out.printf("Contact %s does not exist.%n", callCommand);
            }
            callCommand = scanner.nextLine();
        }
    }
}
