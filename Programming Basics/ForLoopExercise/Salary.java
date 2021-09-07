package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int fine = 0;


            for (int i = 1; i <= n; i++) {
                if (salary > fine) {
                    String siteName = scanner.nextLine();
                    if (siteName.equals("Facebook")) {
                        fine += 150;
                    } else if (siteName.equals("Instagram")) {
                        fine += 100;
                    } else if (siteName.equals("Reddit")) {
                        fine += 50;
                    }
                }
            }
            if (salary > fine){
                System.out.println(salary - fine);
            }else{
                System.out.println("You have lost your salary.");
            }
    }
}