package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfTheField = Integer.parseInt(scanner.nextLine());
        String[] ladybugStartIndex = scanner.nextLine().split(" ");


        int[] ladybugCell = new int[sizeOfTheField];

        for (int i = 0; i < ladybugStartIndex.length; i++) {
            int ladybugIndex = Integer.parseInt(ladybugStartIndex[i]);
            if (ladybugIndex >= 0 && ladybugIndex < ladybugCell.length) {
                ladybugCell[ladybugIndex] = 1;
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] ladyBugCommand = command.split(" ");
            int ladybugIndex = Integer.parseInt(ladyBugCommand[0]);
            String ladybugMovementCommand = ladyBugCommand[1];
            int ladybugMovementIndex = Integer.parseInt(ladyBugCommand[2]);

            if (ladybugIndex < 0 || ladybugIndex >= sizeOfTheField || ladybugCell[ladybugIndex] != 1) {
                command = scanner.nextLine();
                continue;
            }
            ladybugCell[ladybugIndex] = 0;
            if (ladybugMovementCommand.equals("right")) {

                ladybugIndex += ladybugMovementIndex;
                while (ladybugIndex < sizeOfTheField && ladybugCell[ladybugIndex] == 1) {
                    ladybugIndex+=ladybugMovementIndex;
                }
                if (ladybugIndex < sizeOfTheField) {
                    ladybugCell[ladybugIndex] = 1;
                }
            } else if (ladybugMovementCommand.equals("left")) {

                ladybugIndex -= ladybugMovementIndex;
                while (ladybugIndex >= 0 && ladybugCell[ladybugIndex] == 1) {
                    ladybugIndex-=ladybugMovementIndex;
                }
                if (ladybugIndex >= 0) {
                    ladybugCell[ladybugIndex] = 1;
                }
            }

            command = scanner.nextLine();
        }
        for (int numbers : ladybugCell) {
            System.out.print(numbers + " ");
        }
    }
}
