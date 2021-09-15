package MapsLambdaAndStreamAPIExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> letterCount = new LinkedHashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (currentChar == ' '){
                continue;
            }
            if (!letterCount.containsKey(currentChar)){
                letterCount.put(currentChar, 1);
            } else {
                int currentCount = letterCount.get(currentChar) + 1;
                letterCount.put(currentChar, currentCount);
            }
        }

        for (Map.Entry<Character, Integer> entry: letterCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
