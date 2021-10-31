package SetsAndMapsAdvancedExercises;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> userNames = new LinkedHashSet<>();

        for (int i = 1; i <= n; i++) {
            String userName = scanner.nextLine();
            userNames.add(userName);
        }

        userNames.forEach(user -> System.out.println(user));
    }
}
