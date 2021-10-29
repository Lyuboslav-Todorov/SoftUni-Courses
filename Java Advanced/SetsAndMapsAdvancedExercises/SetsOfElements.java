package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int firstSetLength = Integer.parseInt(input.split("\\s+")[0]);
        int secondSetLength = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        Set<Integer> thirdSet = new LinkedHashSet<>();

        for (int i = 1; i <= firstSetLength; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            firstSet.add(currentNumber);
        }

        for (int i = 1; i <= secondSetLength; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            secondSet.add(currentNumber);
        }

        for (int number : firstSet) {
            if (secondSet.contains(number)) {
                thirdSet.add(number);
            }
        }

        //firstSet.retainAll(secondSet);

        thirdSet.forEach(n -> System.out.print(n + " "));
    }
}
