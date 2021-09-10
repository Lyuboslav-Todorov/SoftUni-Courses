package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "Contains":
                    int number = Integer.parseInt(tokens[1]);
                    printIfContains(number, numbers);
                    break;
                case "Print":
                    printEvenOrOdd(numbers, tokens[1]);
                    break;
                case "Get":
                    printNumbersSum(numbers);
                    break;
                case "Filter":
                    printFilteredNumbers(numbers, tokens[1], tokens[2]);
                    break;
            }
        }

    }

    private static void printIfContains(int number, List<Integer> numbersList) {
        boolean isContains = false;
        for (int i = 0; i < numbersList.size(); i++) {
            if (number == numbersList.get(i)) {
                isContains = true;
                break;
            }
        }
        if (isContains) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    private static void printEvenOrOdd(List<Integer> numbersList, String command) {
        List<Integer> output = new ArrayList<>(numbersList.size());
        for (int i = 0; i < numbersList.size(); i++) {
            output.add(numbersList.get(i));
        }
        if (command.equals("even")) {
            for (int i = 0; i < output.size(); i++) {
                if (output.get(i) % 2 == 1) {
                    output.remove(i);
                    i--;
                }
            }
        } else if (command.equals("odd")) {
            for (int i = 0; i < output.size(); i++) {
                if (output.get(i) % 2 == 0) {
                    output.remove(i);
                    i--;
                }
            }
        }
        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void printNumbersSum(List<Integer> integerList) {
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        System.out.println(sum);
    }

    private static void printFilteredNumbers(List<Integer> numbersList, String symbol, String sign) {
        int number = Integer.parseInt(sign);
        List<Integer> output = new ArrayList<>(numbersList.size());
        for (int i = 0; i < numbersList.size(); i++) {
            output.add(numbersList.get(i));
        }
        switch (symbol) {
            case "<":
                for (int i = 0; i < output.size(); i++) {
                    if (output.get(i) >= number) {
                        output.remove(i);
                        i--;
                    }
                }
                break;
            case ">":
                for (int i = 0; i < output.size(); i++) {
                    if (output.get(i) <= number) {
                        output.remove(i);
                        i--;
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < output.size(); i++) {
                    if (output.get(i) > number) {
                        output.remove(i);
                        i--;
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < output.size(); i++) {
                    if (output.get(i) < number) {
                        output.remove(i);
                        i--;
                    }
                }
                break;
        }
        System.out.println(output.toString().replaceAll("[\\[\\],]", ""));
    }


}
