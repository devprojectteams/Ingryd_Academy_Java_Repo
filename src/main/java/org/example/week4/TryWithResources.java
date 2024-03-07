package org.example.week4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void readFile(String fileName) throws IOException, FileNotFoundException {
        try( BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException fileNotFoundException){
            System.out.printf("The file %s could not be found: %s", fileName, fileNotFoundException.getMessage());
            throw new FileNotFoundException("file not found exception");

            }
        }

    public static void main(String[] args) throws IOException {
        readFile("C:\\Users\\user\\IdeaProjects\\IngrydTrainingProgram\\src\\main\\java\\org\\example\\jk\\textFileToReadWrite.txt");
    }
}
