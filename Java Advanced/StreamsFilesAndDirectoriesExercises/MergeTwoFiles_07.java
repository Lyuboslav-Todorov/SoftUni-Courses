package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles_07 {
    public static void main(String[] args) throws IOException {
        String pathOne = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";

        String pathTwo = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        List<String> allLinesFirstFile = Files.readAllLines(Path.of(pathOne));

        List<String> allLinesSecondFile = Files.readAllLines(Path.of(pathTwo));

        PrintWriter writer = new PrintWriter("E:\\softUni\\Java Advanced\\" +
                "10 Exercise Streams, Files and Directories\\output.txt");

        for (String line : allLinesFirstFile) {
            writer.println(line);
        }

        for (String line : allLinesSecondFile) {
            writer.println(line);
        }

        writer.close();
    }
}
