package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegTypes = Integer.parseInt(scanner.nextLine());
        String biggestModelKeg = "";
        double volumeOfTheBiggestKeg = Double.MIN_VALUE;

        for (int i = 1; i <= numberOfKegTypes; i++) {
            String currentModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentKegVolume = Math.PI * Math.pow(radius, 2) *height;
            if (currentKegVolume > volumeOfTheBiggestKeg){
                volumeOfTheBiggestKeg = currentKegVolume;
                biggestModelKeg = currentModel;
            }
        }
        System.out.println(biggestModelKeg);
    }
}
