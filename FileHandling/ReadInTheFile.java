package com.tecktricks.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadInTheFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("src/com/tecktricks/FileHandling/Create.txt"))) {
            String line;
            while((line = br.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
