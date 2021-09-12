package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            List<String> token = Arrays.stream(input.split(" "))
                    .collect(Collectors.toList());
            if (token.get(0).equals("Add")){
                wagons.add(Integer.parseInt(token.get(1)));
            } else {
                int passengers = Integer.parseInt(token.get(0));
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= maxCapacity) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
