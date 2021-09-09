package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int DNALength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int[] DNASequence = new int[DNALength]; // място за съхранчване на най-добрата поредицата
        int bestSequenceIndex = 0; // място за съхранчване на номера най-добрата поредицата
        int bestSequenceSum = 0; //3 място за съхранчване на сумата най-добрата поредицата
        int counterSequence = 0; // поредността на номера
        int bestSequenceLength = 0; //1 място за съхраняване най-добрата поредността от единици
        int bestSequenceStartingIndex = Integer.MAX_VALUE; //2 място за съхраняване започващия индекс на най-добрата поредица

        while (!input.equals("Clone them!")) {
            int[] currentDNA = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            counterSequence+=1;
            int currentSequenceSum = 0; //3 място за съхраняване сумата на текущата поредица
            int currentSequenceCounter = 0;
            int bestCurrentSequenceLength = 0; //1 място за съхраняване най-добрата поредността от единици за текущата поредица
            int currentIndex = 0;
            int bestCurrentIndex = 0; //2
            for (int index = 0; index < currentDNA.length; index++) {
                if (currentDNA[index] == 1) {
                    currentSequenceSum += 1;
                    currentSequenceCounter += 1;
                } else {
                    currentSequenceCounter = 0;
                }
                if (currentSequenceCounter == 1){
                    currentIndex = index;
                }
                if (currentSequenceCounter > bestCurrentSequenceLength) {
                    bestCurrentSequenceLength = currentSequenceCounter;
                    bestCurrentIndex = currentIndex;
                }
            }
            if (bestSequenceLength < bestCurrentSequenceLength) {
                bestSequenceLength = bestCurrentSequenceLength;
                bestSequenceStartingIndex = bestCurrentIndex;
                bestSequenceSum = currentSequenceSum;
                bestSequenceIndex = counterSequence;
                for (int i = 0; i < currentDNA.length; i++) {
                    DNASequence[i] = currentDNA[i];
                }
            } else if (bestSequenceLength == bestCurrentSequenceLength) {
                if (bestSequenceStartingIndex > bestCurrentIndex){
                    bestSequenceStartingIndex = bestCurrentIndex;
                    bestSequenceSum = currentSequenceSum;
                    bestSequenceIndex = counterSequence;
                    for (int i = 0; i < currentDNA.length; i++) {
                        DNASequence[i] = currentDNA[i];
                    }
                }else if (bestSequenceStartingIndex == bestCurrentIndex){
                    if (bestSequenceSum < currentSequenceSum){
                        bestSequenceSum = currentSequenceSum;
                        bestSequenceIndex = counterSequence;
                        for (int i = 0; i < currentDNA.length; i++) {
                            DNASequence[i] = currentDNA[i];
                        }
                    }
                }
            }
            input = scanner.nextLine();
        }
        if(bestSequenceSum == 0){
            bestSequenceIndex = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int numbers : DNASequence) {
            System.out.print(numbers + " ");
        }
    }
}
