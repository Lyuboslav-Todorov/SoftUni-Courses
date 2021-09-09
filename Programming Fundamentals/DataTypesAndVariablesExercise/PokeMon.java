package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenThePokes = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        double halfOfThePower = pokePower * 0.5;

        while (pokePower >= distanceBetweenThePokes){
            pokePower-=distanceBetweenThePokes;
            pokeCounter++;
            if (pokePower == halfOfThePower){
                if (exhaustionFactor > 0) {
                    pokePower/=exhaustionFactor;
                }
            }
        }
        System.out.println(pokePower);
        System.out.println(pokeCounter);
    }
}
