package interfacesAndAbstractionExercises.birthdayCelebrations_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String type = data[0];
            switch (type) {
                case "Citizen":
                    String citizenName = data[1];
                    int citizenAge = Integer.parseInt(data[2]);
                    String citizenId = data[3];
                    String citizenBirthDate = data[4];
                    Citizen citizen = new Citizen(citizenName, citizenAge, citizenId, citizenBirthDate);
                    birthables.add(citizen);
                    break;
                case "Pet":
                    String petName = data[1];
                    String petBirthDate = data[2];
                    Pet pet = new Pet(petName, petBirthDate);
                    birthables.add(pet);
                    break;
                case "Robot":
                    break;
            }

            input = scanner.nextLine();
        }

        String specificYear = scanner.nextLine();

        boolean noSameYearOfBirthAsSpecificYear = true;

        for (Birthable species : birthables) {
            if (species.getBirthDate().endsWith(specificYear)){
                noSameYearOfBirthAsSpecificYear = false;
                System.out.println(species.getBirthDate());
            }
        }

        if (noSameYearOfBirthAsSpecificYear){
            System.out.println("<no output>");
        }
    }
}
