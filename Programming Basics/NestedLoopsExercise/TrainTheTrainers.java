package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double finalScore = 0.0;
        int sumPresentations = 0;

        while (!command.equals("Finish")){
            String presentation = command;
            double currentPresentationScore = 0;
            for (int i = 1; i <= jury ; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                currentPresentationScore += score;
                finalScore += score;
                sumPresentations++;
            }
            System.out.printf("%s - %.2f.%n", presentation, currentPresentationScore / jury);

            command = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", finalScore / sumPresentations);
    }
}
