package Testing3;

import java.util.Scanner;

public class TheMostPowerful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        String mostPowerfulWord = "";
        int wordPower = 0;

        while(!command.equals("End of words")){
            String currentWord = command;
            int currentPower = 0;
            for (int i = 0; i < currentWord.length(); i++) {
                currentPower += currentWord.charAt(i);
            }
            if (currentWord.charAt(0) == 'A' || currentWord.charAt(0) == 'E'|| currentWord.charAt(0) == 'I'||
                    currentWord.charAt(0) == 'O'|| currentWord.charAt(0) == 'U'|| currentWord.charAt(0) == 'Y'||
                    currentWord.charAt(0) == 'a'|| currentWord.charAt(0) == 'e'|| currentWord.charAt(0) == 'i'||
                    currentWord.charAt(0) == 'o'|| currentWord.charAt(0) == 'u'|| currentWord.charAt(0) == 'y'){
                currentPower *= currentWord.length();
            }else{
                currentPower /= currentWord.length();
            }
            if (currentPower > wordPower){
                wordPower = currentPower;
                mostPowerfulWord = currentWord;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, wordPower);
    }
}
