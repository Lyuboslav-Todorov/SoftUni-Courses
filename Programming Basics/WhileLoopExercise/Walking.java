package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;
        int stepsCounter = 0;

        while (stepsCounter <= goal){
            String command = scanner.nextLine();
            if ("Going home".equals(command)){
                int steps = Integer.parseInt(scanner.nextLine());
                stepsCounter += steps;
                break;
            }
            int steps = Integer.parseInt(command);
            stepsCounter += steps;
        }
        int diff = Math.abs(stepsCounter - goal);
        if (goal <= stepsCounter){
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
        }else{
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
