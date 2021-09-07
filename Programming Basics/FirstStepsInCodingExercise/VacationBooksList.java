package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pagesCount = Integer.parseInt(scan.nextLine());
        int pages = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        int timeToRead = pagesCount / pages;
        int hoursPerDay = timeToRead / days;
        System.out.println(hoursPerDay);


    }
}
