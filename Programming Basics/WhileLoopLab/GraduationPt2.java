package WhileLoopLab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int count = 1;
        double sum = 0;
        int excluded = 0;

        while (count <= 12){
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {

                excluded++;
            } else {
                count++;
            }
            if (excluded > 1){
                break;
            }
            sum += grade;

        }
        double avr = sum / 12;
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade", name, count);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", name, avr);
        }
    }
}
