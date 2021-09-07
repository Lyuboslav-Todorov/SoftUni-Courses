package WhileLoopLab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int volumeApartment = width * length * height;
        int volumeBoxes = 0;

        while (!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            volumeBoxes += boxes;
            if (volumeApartment < volumeBoxes) {
                break;
            }
            input = scanner.nextLine();
        }
        int dif = Math. abs(volumeApartment - volumeBoxes);
        if (volumeApartment >= volumeBoxes) {
            System.out.printf("%d Cubic meters left.", dif );
        }else{
            System.out.printf("No more free space! You need %d Cubic meters more.", dif);
        }
    }
}
