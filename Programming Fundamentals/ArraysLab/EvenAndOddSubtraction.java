package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0){
                sumEven+=input[i];
            }else{
                sumOdd+=input[i];
            }
        }
        System.out.println(sumEven - sumOdd);
    }
}
