package com.tecktricks.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderUsingScanner {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new File("src/com/tecktricks/FileHandling/Create.txt"))) {
            String line;
            while(scanner.hasNext()){
                line= scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
