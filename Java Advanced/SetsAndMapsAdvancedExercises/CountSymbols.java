package SetsAndMapsAdvancedExercises;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int index = 0; index < input.length(); index++) {
            char currentSymbol = input.charAt(index);
            if (!symbols.containsKey(currentSymbol)){
                symbols.put(currentSymbol, 1);
            } else {
                symbols.put(currentSymbol, symbols.get(currentSymbol) + 1);
            }
        }

       // symbols.entrySet().forEach(s -> System.out.println(s.getKey() + ": " + s.getValue() + " time/s"));

        for (Map.Entry<Character, Integer> entry: symbols.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
