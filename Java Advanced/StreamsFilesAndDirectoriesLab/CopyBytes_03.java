package StreamsFilesAndDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes_03 {
    public static void main(String[] args) throws IOException{

        String inputPath = "E:\\softUni\\Java Advanced\\9 Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(inputPath);

        FileOutputStream outputStream = new FileOutputStream("E:\\softUni\\Java Advanced\\9 Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt");

        int value = inputStream.read();

        PrintStream out = new PrintStream(outputStream);


        while (value != -1){
            if (value != 32 && value != 10){
                out.print(value);;
            } else {
                out.print((char) value);
            }
            value = inputStream.read();
        }

        inputStream.close();
        outputStream.close();
    }
}
