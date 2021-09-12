package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int first = firstPlayerCards.get(0);
            int second = secondPlayerCards.get(0);
            if (first == second) {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
            } else {
                firstPlayerCards.remove(0);
                secondPlayerCards.remove(0);
                if (first > second) {
                    firstPlayerCards.add(first);
                    firstPlayerCards.add(second);
                } else {
                    secondPlayerCards.add(second);
                    secondPlayerCards.add(first);
                }
            }
        }
        int sum = 0;
        if (firstPlayerCards.isEmpty()) {
            for (int number : secondPlayerCards) {
                sum += number;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else {
            for (int number : firstPlayerCards) {
                sum += number;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
