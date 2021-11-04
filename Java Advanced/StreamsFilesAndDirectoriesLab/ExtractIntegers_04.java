package StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws IOException {

        String path = "E:\\softUni\\Java Advanced\\9 Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        FileOutputStream outputStream = new FileOutputStream("E:\\softUni\\Java Advanced\\9 Streams, Files and Directories" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt");

        PrintStream out = new PrintStream(outputStream);

        Scanner scanner = new Scanner(inputStream);


        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }
        out.close();
    }
}
