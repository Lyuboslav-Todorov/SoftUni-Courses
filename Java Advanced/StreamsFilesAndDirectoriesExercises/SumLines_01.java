package StreamsFilesAndDirectoriesExercises;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines_01 {
    public static void main(String[] args) throws IOException {
        String pathStr = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        Path path = Path.of(pathStr);

        List<String> allLines = Files.readAllLines(path);

        allLines.stream().map(String::toCharArray).forEach(
                charArray -> {
                    int sum = 0;
                    for (char symbol: charArray) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                }
        );

    }
}
