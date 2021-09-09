package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        StringBuilder passwordBuilder = new StringBuilder();

        for (int position = userName.length() - 1; position >= 0 ; position--) {
           passwordBuilder.append(userName.charAt(position));
        }
        String password = passwordBuilder.toString();
        int counter = 0;

        String input = scanner.nextLine();
        while (!input.equals(password)){
            counter++;
            if (counter > 3){
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (counter < 4){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
