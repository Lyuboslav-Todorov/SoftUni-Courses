package interfacesAndAbstractionExercises.foodShortage_04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBuyers = Integer.parseInt(scanner.nextLine());

        Set<Buyer> buyers = new HashSet<>();

        while (numberOfBuyers-- > 0){
            String[] buyerData = scanner.nextLine().split("\\s+");
            String name = buyerData[0];
            int age = Integer.parseInt(buyerData[1]);
            if (buyerData.length == 3){
                String group = buyerData[2];
                Rebel rebel = new Rebel(name, age, group);
                buyers.add(rebel);

            } else if (buyerData.length == 4){
                String id = buyerData[2];
                String birthDate = buyerData[3];
                Citizen citizen = new Citizen(name, age, id, birthDate);
                buyers.add(citizen);
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String name = command;
            for (Buyer buyer : buyers) {
                if (name.equals(buyer.getName())){
                    buyer.buyFood();
                    break;
                }
            }


            command = scanner.nextLine();
        }

        int boughtFood = 0;

        for (Buyer buyer : buyers) {
            boughtFood += buyer.getFood();
        }

        System.out.println(boughtFood);
    }
}
