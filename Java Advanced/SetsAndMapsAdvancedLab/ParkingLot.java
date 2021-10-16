package SetsAndMapsAdvancedLab;

import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String action = input.split(", ")[0];
            String number = input.split(", ")[1];

            switch (action){
                case "IN" :
                    parking.add(number);
                    break;
                case "OUT" :
                    parking.remove(number);
                    break;
            }
            input = scanner.nextLine();
        }

        String output = parking.isEmpty() ?
                "Parking Lot is Empty" :
                String.join(System.lineSeparator(), parking);

        System.out.println(output);

    }
}
