package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int permissiblePoorResults = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();

        boolean isGraduated = true;
        int poorResults = 0;
        int sumResult = 0;
        int problemsCount = 0;
        String lastProblem = "";

        while (!problem.equals("Enough")){
            int result = Integer.parseInt(scanner.nextLine());
            sumResult += result;
            problemsCount++;
            lastProblem = problem;
            if (result <= 4){
                poorResults++;
                if (permissiblePoorResults == poorResults){
                    isGraduated = false;
                    break;
                }
            }
            problem = scanner.nextLine();
        }
        double averageScore = sumResult / (problemsCount * 1.00);
        if (isGraduated){
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s",
                    averageScore, problemsCount, lastProblem);
        }else{
            System.out.printf("You need a break, %d poor grades.", poorResults);
        }

    }
}
