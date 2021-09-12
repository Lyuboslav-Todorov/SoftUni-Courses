package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] commandData = command.split(" ");
            if (commandData[0].equals("Delete")){
                int number = Integer.parseInt(commandData[1]);
                for (int i = 0; i < numbers.size(); i++) {
                    if (number == numbers.get(i)){
                        numbers.remove(i);
                        i--;
                    }
                }
            } else if (commandData[0].equals("Insert")){
                int element = Integer.parseInt(commandData[1]);
                int index = Integer.parseInt(commandData[2]);
                numbers.add(index, element);
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
