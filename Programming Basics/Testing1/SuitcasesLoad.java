package Testing1;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double volume = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double totalBagsVolume = 0;
        int bagsCounter = 0;
        boolean noSpace = false;

        while (!command.equals("End")){
            double bagVolume = Double.parseDouble(command);
            bagsCounter++;
            if (bagsCounter % 3 == 0){
                totalBagsVolume += bagVolume + bagVolume * 0.1;
            }else{
                totalBagsVolume += bagVolume;
            }
            if (volume < totalBagsVolume){
                noSpace = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (noSpace){
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", bagsCounter - 1);
        }else{
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", bagsCounter);
        }

    }
}
