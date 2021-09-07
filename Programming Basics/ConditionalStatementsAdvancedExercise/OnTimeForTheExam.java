package ConditionalStatementsAdvancedExercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTimeInMin = examHour * 60 + examMin;
        int arrivalTmeInMin = arrivalHour * 60 + arrivalMin;
        int timeDifference = examTimeInMin - arrivalTmeInMin;
        int resultHour= timeDifference / 60;
        int resultMin = timeDifference % 60;

        if (timeDifference > 30){
            if (timeDifference < 60){
                System.out.println("Early");
                System.out.printf("%d minutes before the start",resultMin);
            }else{
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start", resultHour, resultMin);
            }
        } else if (timeDifference >= 0){
            System.out.println("On time");
            if (timeDifference > 0){
                System.out.printf("%d minutes before the start", resultMin);
            }
        }else{
            timeDifference = Math.abs(timeDifference);
            resultHour = Math.abs(resultHour);
            resultMin = Math.abs(resultMin);
            System.out.println("Late");
            if (timeDifference < 60){
                System.out.printf("%d minutes after the start",resultMin);
            }else{
                System.out.printf("%d:%02d hours after the start", resultHour, resultMin);
            }
        }
    }
}
