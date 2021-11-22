package workingWithAbstractionLab.hotelReservation;

public enum Discount {
    NONE(0),
    SECONDVISIT(10),
    VIP(20);

    private int value;

    Discount(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }


}
