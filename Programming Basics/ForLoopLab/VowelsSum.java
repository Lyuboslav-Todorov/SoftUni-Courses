package ForLoopLab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int num = 0;

        for (int i = 0; i < text.length() ; i++) {
            char letter = text.charAt(i);
            switch (letter){
                case 'a':
                    num += 1;
                    break;
                case 'e':
                    num += 2;
                    break;
                case 'i':
                    num += 3;
                    break;
                case 'o':
                    num += 4;
                    break;
                case 'u':
                    num += 5;
                    break;
            }
        }
        System.out.println(num);
    }
}
