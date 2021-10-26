package SetsAndMapsAdvancedExercises;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] elements = input.split("\\s+");
            Collections.addAll(chemicalElements, elements);
        }

        chemicalElements.forEach(e -> System.out.print(e + " "));
    }
}
