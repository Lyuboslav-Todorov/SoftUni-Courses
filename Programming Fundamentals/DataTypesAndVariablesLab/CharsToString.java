package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c1 = scanner.nextLine().charAt(0);
        char c2 = scanner.nextLine().charAt(0);
        char c3 = scanner.nextLine().charAt(0);
        /*
        StringBuilder outputBuilder = new StringBuilder();

        outputBuilder.append(c1);
        outputBuilder.append(c2);
        outputBuilder.append(c3);

        String output = outputBuilder.toString();
        System.out.println(output);;
        */
        System.out.printf("%s%s%s", c1, c2, c3);
    }
}
