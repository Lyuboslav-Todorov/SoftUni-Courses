package ForLoopLab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;

        for (int i = 1; i <= n ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            num += input;
        }
        System.out.println(num);
    }
}
