package ConditionalStatementsExercise;

import javax.swing.*;
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageScore = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double excellentScholarship = 0;

        if (averageScore > 4.5) {
            if (income < minSalary){
                socialScholarship = Math.floor(minSalary * 0.35);
            }

            if (averageScore >= 5.50) {
                excellentScholarship = Math.floor(averageScore * 25);
            }
        }
        if (socialScholarship == 0 && excellentScholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > excellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN",socialScholarship);
        } else if (excellentScholarship >= socialScholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentScholarship);
        }

    }
}
