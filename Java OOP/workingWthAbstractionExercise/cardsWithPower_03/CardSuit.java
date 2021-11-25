package workingWthAbstractionExercise.cardsWithPower_03;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    final private int suit;

    CardSuit(int suit){
        this.suit =suit;
    }

    public int getSuit() {
        return suit;
    }
}
