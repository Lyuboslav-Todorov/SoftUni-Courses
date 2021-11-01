package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes_04 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";


        List<String> allLines = Files.readAllLines(Path.of(path));

        int vowelsCount = 0;
        int consonantsCount = 0;
        int punctuationCount = 0;

        for (String line : allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentChar = line.charAt(i);
                if (currentChar == ' '){
                    continue;
                }
                if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||
                        currentChar == 'o' || currentChar == 'u') {
                    vowelsCount++;
                } else if (currentChar == '!' || currentChar == '?' || currentChar == ',' ||
                        currentChar == '.'){
                    punctuationCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        BufferedWriter writer = new BufferedWriter(new PrintWriter("E:\\softUni\\Java Advanced\\" +
                "10 Exercise Streams, Files and Directories\\output.txt"));

        writer.write("Vowels: " + vowelsCount);
        writer.newLine();
        writer.write("Consonants: " + consonantsCount);
        writer.newLine();
        writer.write("Punctuation: " + punctuationCount);
        writer.close();
    }
}
