package ForLoopExercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;


        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > 0 && number < 200){
                p1 += 1;
            } else if (number < 400){
                p2 +=1;
            } else if (number < 600) {
                p3 += 1;
            } else if (number < 800) {
                p4 += 1;
            } else if (number <= 1000){
                p5 += 1;
            }
        }
        double pSum = p1 + p2 + p3 + p4 + p5;

        double p1Percent = (100 / pSum) * p1;
        double p2Percent = (100 / pSum) * p2;
        double p3Percent = (100 / pSum) * p3;
        double p4Percent = (100 / pSum) * p4;
        double p5Percent = (100 / pSum) * p5;

        char percent = '%';

        System.out.printf("%.2f%s %n", p1Percent, percent);
        System.out.printf("%.2f%s%n", p2Percent, percent);
        System.out.printf("%.2f%s%n", p3Percent, percent);
        System.out.printf("%.2f%s%n", p4Percent, percent);
        System.out.printf("%.2f%s", p5Percent, percent);
    }
}
