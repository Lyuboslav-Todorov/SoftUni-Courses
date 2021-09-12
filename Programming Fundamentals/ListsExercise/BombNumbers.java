package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int bomb = input[0];
        int power = input[1];

        for (int i = 1; i <= power; i++) {
            for (int index = 0; index < numbers.size(); index++) {
                if (numbers.get(index) == bomb) {
                    if (numbers.size() - 1 > index) {
                        numbers.remove(index + 1);
                    }
                    if (index > 0) {
                        numbers.remove(index -1);
                        index--;
                    }
                }
            }
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == bomb){
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
