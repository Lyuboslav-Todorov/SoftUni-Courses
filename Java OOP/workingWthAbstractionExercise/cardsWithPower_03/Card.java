package workingWthAbstractionExercise.cardsWithPower_03;

public class Card {
    private int rankPower;
    private int suitPower;

    Card(int rankPower, int suitPower){
        this.rankPower = rankPower;
        this.suitPower = suitPower;
    }

    public static int calculatePower(int rankPower, int suitPower){
        return rankPower + suitPower;
    }

}
