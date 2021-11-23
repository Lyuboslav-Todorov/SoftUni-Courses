package workingWithAbstractionLab.hotelReservation;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private String season;
    private int value;

    Season(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
