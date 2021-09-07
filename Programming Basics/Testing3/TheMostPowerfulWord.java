package Testing3;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String mostPowerfulWord = "";
        double highestScore = Double.NEGATIVE_INFINITY;

        while (!input.equals("End of words")){
            String word = input;
            double currentWordScore = 0.0;
            for (int i = 0; i < word.length() ; i++) {
                int symbol = word.charAt(i);
                currentWordScore += symbol;
            }
            if (word.charAt(0) == 65 || word.charAt(0) == 69 || word.charAt(0) == 73
            || word.charAt(0) == 79 || word.charAt(0) == 85 || word.charAt(0) == 89
            || word.charAt(0) == 97 || word.charAt(0) == 101 || word.charAt(0) == 105
            || word.charAt(0) == 111 || word.charAt(0) == 117 || word.charAt(0) == 121){
                currentWordScore = currentWordScore * word.length();
            }else{
                currentWordScore = currentWordScore / word.length();
            }

            if (currentWordScore > highestScore){
                mostPowerfulWord = word;
                highestScore = Math.floor(currentWordScore);
            }
            input = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", mostPowerfulWord, highestScore);
    }
}
