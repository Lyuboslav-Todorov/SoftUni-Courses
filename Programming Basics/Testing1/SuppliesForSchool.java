package Testing1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pen = Integer.parseInt(scanner.nextLine());
        int marker = Integer.parseInt(scanner.nextLine());
        double cleaningDetergent = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double totalSum = pen * 5.80 + marker * 7.20 + cleaningDetergent * 1.20;
        double sumAfterDiscount = totalSum - totalSum * discount * 0.01;

        System.out.printf("%.3f", sumAfterDiscount);
    }
}
