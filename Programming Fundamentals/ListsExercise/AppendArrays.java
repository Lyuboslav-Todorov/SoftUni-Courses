package ListsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        List<String> output = new ArrayList<>();

        for (int i = input.size() - 1; i >= 0; i++) {
            String currentString = input.get(i);
            String[] currentArray = currentString.split(" ");
            for (int j = 0; j < currentArray.length; j++) {
                output.add(currentArray[i]);
            }
        }
        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
    }
}
