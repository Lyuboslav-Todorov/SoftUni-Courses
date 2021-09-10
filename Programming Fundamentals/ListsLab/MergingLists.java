package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = Math.max(firstNumbers.size(), secondNumbers.size());

        for (int i = 0; i < size; i++) {
            if (i < firstNumbers.size()){
                System.out.print(firstNumbers.get(i) + " ");
            }
            if (i < secondNumbers.size()){
                System.out.print(secondNumbers.get(i) + " ");
            }
        }
    }
}
