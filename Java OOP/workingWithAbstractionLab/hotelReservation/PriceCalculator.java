package workingWithAbstractionLab.hotelReservation;

public class PriceCalculator {
    private double price;
    private int days;
    private String season;
    private String discount;


    public PriceCalculator(double price, int days, String season, String discount) {
        this.price = price;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculate(){
        return CalculatePrice(this.price, this.days,Season.valueOf(season), Discount.valueOf(discount));
    }

    public static double CalculatePrice (double pricePerDay, int numberOfDays, Season season, Discount discount){
        int multiplayer = season.getValue();
        double discountMultiplayer = discount.getValue() / 100.0;
        double priceBeforeDiscount = pricePerDay * numberOfDays * multiplayer;
        double discountedAmount = priceBeforeDiscount * discountMultiplayer;
        return priceBeforeDiscount - discountedAmount;
    }

}
