package interfacesAndAbstractionLab.borderControl_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiables = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            String[] token = line.split("\\s+");
            Identifiable identifiable = token.length == 2
                    ? new Robot(token[0], token[1])
                    : new Citizen(token[0], Integer.parseInt(token[1]), token[2]);

            identifiables.add(identifiable);

            line = scanner.nextLine();
        }

        String fakeIdsLastDigits = scanner.nextLine();

        System.out.println(identifiables.stream()
                .map(Identifiable::getId)
                .filter(id -> id.endsWith(fakeIdsLastDigits))
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
