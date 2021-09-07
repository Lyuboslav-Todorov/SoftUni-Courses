package Testing3;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int notBePainted = Integer.parseInt(scanner.nextLine());

        double notPaintingArea = Math.ceil(4.0 * height * width / 100 * notBePainted) ;
        double area = 4 * height * width - notPaintingArea;


        boolean isPainted = false;
        String command = scanner.nextLine();

        while(!command.equals("Tired!")){
            int paintLiters = Integer.parseInt(command);
            area -= paintLiters;
            if (area <= 0){
                isPainted = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (isPainted) {
            if (area < 0){
                System.out.printf("All walls are painted and you have %.0f l paint left!", Math.abs(area));
            }else{
                System.out.println("All walls are painted! Great job, Pesho!");
            }

        }else{
            System.out.printf("%.0f quadratic m left.", area);
        }

    }
}
