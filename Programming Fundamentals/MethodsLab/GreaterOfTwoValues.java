package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        if (type.equals("int")){
            int firstValue = Integer.parseInt(scanner.nextLine());
            int secondValue = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstValue, secondValue));
        } else if (type.equals("char")){
            char firstValue = scanner.nextLine().charAt(0);
            char secondValue = scanner.nextLine().charAt(0);
            System.out.println(getMax(firstValue, secondValue));
        } else if (type.equals("string")){
            String firstValue = scanner.nextLine();
            String secondValue = scanner.nextLine();
            System.out.println(getMax(firstValue, secondValue));
        }
    }

    static int getMax(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }
        return secondNumber;
    }

    static char getMax(char first, char second){
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second){
        if (first.compareTo(second)>=0){
            return first;
        }
        return  second;
    }

}
