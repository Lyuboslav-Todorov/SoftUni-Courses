package Testing1;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int musalaCounter = 0;
        int montBlancCounter = 0;
        int kilimanjaroCounter = 0;
        int k2Counter = 0;
        int everestCounter = 0;
        int totalPeople = 0;

        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            if (people <= 5 ){
                musalaCounter += people;
                totalPeople += people;
            }else if (people <= 12){
                montBlancCounter += people;
                totalPeople += people;
            }else if (people <= 25) {
                kilimanjaroCounter += people;
                totalPeople += people;
            }else if (people <= 40) {
                k2Counter += people;
                totalPeople += people;
            }else if (people > 40){
                everestCounter += people;
                totalPeople += people;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * musalaCounter/totalPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * montBlancCounter/totalPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * kilimanjaroCounter/totalPeople * 100);
        System.out.printf("%.2f%%%n", 1.0 * k2Counter/totalPeople * 100);
        System.out.printf("%.2f%%", 1.0 * everestCounter/totalPeople * 100);
    }
}
