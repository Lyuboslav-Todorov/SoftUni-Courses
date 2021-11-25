package workingWthAbstractionExercise.cardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank cardRank = CardRank.valueOf(scanner.nextLine());
        CardSuit cardSuit = CardSuit.valueOf(scanner.nextLine());


        System.out.printf("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(),
                Card.calculatePower(cardRank.getRank(), cardSuit.getSuit()));


    }
}
