package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")){
            studioPrice = nights * 50;
            apartmentPrice = nights * 65;
            if (nights > 7 && nights <= 14){
                studioPrice = studioPrice - studioPrice * 0.05;
            }else if (nights > 14){
                studioPrice = studioPrice - studioPrice * 0.30;
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }
        }else if (month.equals("June") || month.equals("September")){
            studioPrice = nights * 75.20;
            apartmentPrice = nights * 68.70;
            if (nights > 14){
                studioPrice = studioPrice - studioPrice * 0.20;
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }
        }else if (month.equals("July") || month.equals("August")){
            studioPrice = nights * 76;
            apartmentPrice = nights * 77;
            if (nights > 14){
                apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
            }
        }
        System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}
