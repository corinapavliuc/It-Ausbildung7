package Homework1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTextFiles {
    public static void main(String[] args) {
        String directoryPath = "путь_к_папке"; // Замените на путь к вашей папке

        try {
            Files.walk(Paths.get(directoryPath))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".txt"))
                    .forEach(ListTextFiles::readAndPrintFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndPrintFile(Path filePath) {
        System.out.println("Reading contents of file: " + filePath);
        try {
            List<String> lines = Files.readAllLines(filePath);
            lines.forEach(System.out::println);
            System.out.println("---------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
