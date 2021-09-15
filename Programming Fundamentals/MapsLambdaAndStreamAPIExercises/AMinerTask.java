package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resources = scanner.nextLine();
        Map<String, Integer> excavatedResources = new LinkedHashMap<>();

        while (!resources.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!excavatedResources.containsKey(resources)){
                excavatedResources.put(resources, quantity);
            } else {
             excavatedResources.put(resources, excavatedResources.get(resources) + quantity);
            }
            resources = scanner.nextLine();
        }
        excavatedResources.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
