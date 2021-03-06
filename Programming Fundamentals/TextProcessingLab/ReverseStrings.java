package TextProcessingLab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String output = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                output += input.charAt(i);
            }
            System.out.println(input + " = " + output);
            input = scanner.nextLine();
        }
    }
}
