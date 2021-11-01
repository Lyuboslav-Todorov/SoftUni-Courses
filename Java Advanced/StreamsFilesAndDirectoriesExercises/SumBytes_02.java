package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class SumBytes_02 {
    public static void main(String[] args) throws IOException {
        String path = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        byte[] bytes = Files.readAllBytes(Path.of(path));

        long sum = 0;

        for (byte b: bytes) {
            if (b != 13 && b != 10){
                sum += b;
            }
        }
        System.out.println(sum);
    }
}
