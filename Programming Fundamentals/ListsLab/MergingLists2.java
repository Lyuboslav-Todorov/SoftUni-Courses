package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class MergingLists2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int minSize = Math.min(firstNumbers.size(), secondNumbers.size());

        for (int i = 0; i < minSize; i++) {
            result.add(Integer.valueOf(firstNumbers.get(i)));
            result.add(Integer.valueOf(secondNumbers.get(i)));
        }
        if (firstNumbers.size() > secondNumbers.size()) {
            result.addAll(getRemainingElements(firstNumbers, secondNumbers));
        } else if (firstNumbers.size() < secondNumbers.size()) {
            result.addAll(getRemainingElements(secondNumbers, firstNumbers));
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));

    }

    private static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer>remainingNumbers = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            remainingNumbers.add(longerList.get(i));
        }
        return remainingNumbers;
    }


}
