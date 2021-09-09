package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (String text : firstArray) {
                if (secondArray[i].equals(text)){
                    System.out.print(text + " ");
                }
            }
        }
    }
}
