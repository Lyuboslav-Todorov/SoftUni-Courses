package ForLoopExercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int biggestNum = Integer.MIN_VALUE;
        int sumNum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sumNum +=num;
            if (biggestNum < num){
                biggestNum = num;
            }
        }
        sumNum = sumNum - biggestNum;
        if (biggestNum != sumNum){
            int diff = Math.abs(biggestNum - sumNum);
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        } else{
            System.out.println("Yes");
            System.out.printf("Sum = %d", biggestNum);
        }
    }
}
