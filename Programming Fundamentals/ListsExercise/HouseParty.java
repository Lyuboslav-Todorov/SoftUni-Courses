package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> partyPeople = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String name = command[0];
            if (command[2].equals("going!")){
                if (partyPeople.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    partyPeople.add(name);
                }
            } else if (command[2].equals("not")){
                    if (partyPeople.contains(name)){
                        partyPeople.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }

            }

        }
        for (String names: partyPeople) {
            System.out.println(names);
        }
    }
}
