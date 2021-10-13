package SetsAndMapsAdvancedLab;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        double[] numbs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (int i = 0; i < numbs.length; i++) {
            if (!numbers.containsKey(numbs[i])){
                numbers.put(numbs[i], 1);
            } else {
                numbers.put(numbs[i], numbers.get(numbs[i]) + 1);
            }

        }

        for (Double key : numbers.keySet()) {
            System.out.printf("%.1f -> %d%n", key, numbers.get(key));
        }
    }
}
