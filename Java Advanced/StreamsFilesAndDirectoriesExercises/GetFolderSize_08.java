package StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class GetFolderSize_08 {
    public static void main(String[] args) {
        String path = "E:\\softUni\\Java Advanced\\10 Exercise Streams, Files and Directories\\" +
                "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);
        File[] filesFolder = folder.listFiles();

        int folderSize = 0;

        for (File file : filesFolder) {
            folderSize += file.length();
        }
        System.out.println("Folder size: " + folderSize);
    }
}
