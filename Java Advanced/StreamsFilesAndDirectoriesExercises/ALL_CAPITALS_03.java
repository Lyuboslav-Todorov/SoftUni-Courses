package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;


public class ALL_CAPITALS_03 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        BufferedWriter writer = new BufferedWriter(new PrintWriter("E:\\softUni\\Java Advanced\\" +
                "10 Exercise Streams, Files and Directories\\output.txt"));

        Files.readAllLines(Path.of(path)).forEach(
                line -> {
                    try {
                        writer.write(line.toUpperCase(Locale.ROOT));
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        );
        writer.close();
    }
}
