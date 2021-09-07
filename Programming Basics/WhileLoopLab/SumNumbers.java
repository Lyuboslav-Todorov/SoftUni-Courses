package WhileLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;

        while(sumNum < n){
            int num = Integer.parseInt(scanner.nextLine());
            sumNum += num;
        }
        System.out.println(sumNum);
    }
}
