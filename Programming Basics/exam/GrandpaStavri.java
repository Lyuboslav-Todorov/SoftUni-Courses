package exam;

import java.util.Scanner;

public class GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double totalLiters = 0;
        double sumDegrees = 0;

        for (int i = 1; i <= days; i++) {
            double liters = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            totalLiters += liters;
            sumDegrees += liters * degrees;
        }
        double totalDegrees = sumDegrees / totalLiters;

        System.out.printf("Liter: %.2f%n", totalLiters);
        System.out.printf("Degrees: %.2f%n", totalDegrees);
        if (totalDegrees < 38){
            System.out.println("Not good, you should baking!");
        }else if (totalDegrees > 42){
            System.out.println("Dilution with distilled water!");
        }else{
            System.out.println("Super!");
        }


    }
}
