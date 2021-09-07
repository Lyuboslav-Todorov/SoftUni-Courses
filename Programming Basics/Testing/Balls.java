package Testing;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ballCount = Integer.parseInt(scanner.nextLine());

        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherColors = 0;
        int totalPoints = 0;

        for (int i = 1; i <= ballCount ; i++) {
            String ballColor = scanner.nextLine();
            switch (ballColor){
                case "red":
                    redBalls ++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orangeBalls++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellowBalls++;
                    totalPoints += 15;
                    break;
                case "white":
                    whiteBalls++;
                    totalPoints += 20;
                    break;
                case "black":
                    blackBalls++;
                    totalPoints /= 2;
                    break;
                default:
                    otherColors++;
                    break;
            }
        }

        System.out.printf("Total points: %d%nPoints from red balls: %d%nPoints from orange balls: %d%n" +
                "Points from yellow balls: %d%nPoints from white balls: %d%nOther colors picked: %d%n" +
                "Divides from black balls: %d", totalPoints, redBalls,orangeBalls,yellowBalls, whiteBalls, otherColors,
                blackBalls);

    }
}
