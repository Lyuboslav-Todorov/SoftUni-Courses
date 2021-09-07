package Testing;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String bestPlayer = "";
        int goals = 0;


        while (!input.equals("END")){
            String name = input;
            int goalScored = Integer.parseInt(scanner.nextLine());
            if (goalScored > goals){
                bestPlayer = name;
                goals = goalScored;
            }
            if (goalScored >= 10 ){
                break;
            }
            input = scanner.nextLine();
        }

        if (goals >= 3){
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", bestPlayer, goals);
        }else{
            System.out.printf("%s is the best player!%nHe has scored %d goals.", bestPlayer, goals);
        }

    }
}
