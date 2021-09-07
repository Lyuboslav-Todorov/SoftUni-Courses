package exam;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int days = 1;
        int metersClimbed = 5364;
        boolean isReached = false;

        while (!command.equals("END")){
            String sleep = command;
            int meters = Integer.parseInt(scanner.nextLine());
            if (sleep.equals("Yes")){
                days ++;
                if (days > 5){
                    break;
                }
            }
            metersClimbed += meters;
            if (metersClimbed >= 8848){
                isReached = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (isReached){
            System.out.printf("Goal reached for %d days!", days);
        }else{
            System.out.println("Failed!");
            System.out.printf("%d", metersClimbed);
        }

    }
}
