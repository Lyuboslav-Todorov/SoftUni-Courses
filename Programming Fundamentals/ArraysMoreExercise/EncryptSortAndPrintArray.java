package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [] results = new int[n];

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'A' || input.charAt(j) == 'E' || input.charAt(j) == 'I' ||input.charAt(j) == 'O' ||
                        input.charAt(j) == 'U' || input.charAt(j) == 'a' || input.charAt(j) == 'e' ||
                        input.charAt(j) == 'i' || input.charAt(j) == 'o' || input.charAt(j) == 'u'){
                    results[i] += input.charAt(j) * input.length();
                }else{
                    results[i] += input.charAt(j) / input.length();
                }
            }
        }
        Arrays.sort(results);
        for (int numbers : results) {
            System.out.println(numbers + " ");
        }
    }
}
