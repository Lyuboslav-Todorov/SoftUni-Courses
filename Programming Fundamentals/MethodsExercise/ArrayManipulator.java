package MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int array [] = new int [numbers.length];

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String input[] = command.split(" ");
            switch (input[0]) {
                case "exchange":
                    int splitIndex = Integer.parseInt(input[1]);
                    if (indexValidation(numbers.length, splitIndex)){
                        for (int i = 0; i <= splitIndex; i++) {

                        }
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (input[1].equals("even")){

                    }else if (input[1].equals("odd")){

                    }
                    break;
                case "min" :
                    break;
                case "first":
                    break;
                case "last":
                    break;

            }



            command = scanner.nextLine();
        }
    }

    private static boolean indexValidation(int length, int splitIndex) {
        return splitIndex <= 0 && splitIndex <= length - 1;
    }
}
