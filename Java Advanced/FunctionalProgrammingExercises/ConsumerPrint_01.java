package FunctionalProgrammingExercises;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerPrint_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

       /* Consumer<String> printNames = n -> System.out.println(n);

        for (String name : input) {
            printNames.accept(name);
        } */

        Consumer<String[]> printName = arr -> {
            for (String name : input) {
                System.out.println(name);
            }
        };
        printName.accept(input);
    }
}
