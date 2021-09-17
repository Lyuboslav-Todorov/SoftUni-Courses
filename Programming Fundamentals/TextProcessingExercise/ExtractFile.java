package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("\\\\");
        String fileFullName = path[path.length - 1];
        String name = fileFullName.split("\\.")[0];
        String extension = fileFullName.split("\\.")[1];

        System.out.printf("File name: %s%nFile extension: %s", name, extension);
    }
}
