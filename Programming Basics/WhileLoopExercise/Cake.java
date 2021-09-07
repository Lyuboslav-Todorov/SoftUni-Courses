package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        int totalPiecesOfCake = width * length;
        int takenPieces = 0;

        while (!input.equals("STOP")){
            int pieces = Integer.parseInt(input);
            takenPieces += pieces;
            if (totalPiecesOfCake <= takenPieces){
                break;
            }
            input = scanner.nextLine();
        }
        int diff = Math.abs(totalPiecesOfCake - takenPieces);
        if (totalPiecesOfCake > takenPieces) {
            System.out.printf("%d pieces are left.", diff);
        }else{
            System.out.printf("No more cake left! You need %d pieces more.", diff );
        }
    }
}
