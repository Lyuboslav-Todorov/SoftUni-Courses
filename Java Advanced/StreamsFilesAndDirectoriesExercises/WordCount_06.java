package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount_06 {
    public static void main(String[] args) throws IOException {
        String pathOne = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";

        List<String> allLinesOne = Files.readAllLines(Path.of(pathOne));

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String line : allLinesOne) {
            String[] currentArray = line.split("\\s+");
            for (int i = 0; i < currentArray.length; i++) {
                String currentWord = currentArray[i].toLowerCase(Locale.ROOT);
                map.putIfAbsent(currentWord, 0);
            }
        }
        String pathTwo = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        List<String> allLinesTwo = Files.readAllLines(Path.of(pathTwo));

        for (String line : allLinesTwo) {
            String[] wordsInLine = line.split("\\s+");
            Arrays.stream(wordsInLine).forEach(word ->
            {
                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                }
            });
        }

        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        PrintWriter writer = new PrintWriter("E:\\softUni\\Java Advanced\\" +
                "10 Exercise Streams, Files and Directories\\output.txt");

        map.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.close();
    }
}
