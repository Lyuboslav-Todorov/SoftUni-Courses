package ForLoopExercise;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = Double.POSITIVE_INFINITY;
        double oddMax = Double.NEGATIVE_INFINITY;
        double evenSum = 0;
        double evenMin = Double.POSITIVE_INFINITY;
        double evenMax = Double.NEGATIVE_INFINITY;


        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());
            if (i % 2 != 0){
                oddSum += num;
                if (num < oddMin){
                    oddMin = num;
                }
                if (num > oddMax){
                    oddMax= num;
                }
            }else {
                evenSum += num;
                if (num < evenMin){
                    evenMin = num;
                }
                if (num > evenMax){
                    evenMax = num;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (oddMin == 0 || oddMin == Double.POSITIVE_INFINITY) {
            System.out.println("OddMin=No,");
        }else{
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == 0 || oddMax == Double.NEGATIVE_INFINITY ){
            System.out.println("OddMax=No,");
        }else{
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (evenMin == 0 || evenMin == Double.POSITIVE_INFINITY){
            System.out.println("EvenMin=No,");
        }else{
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == 0 || evenMax == Double.NEGATIVE_INFINITY ){
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}
