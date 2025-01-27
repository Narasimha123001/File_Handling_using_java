package com.tecktricks.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOntoWrite {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/tecktricks/FileHandling/Create.txt",true))){
            bw.newLine();
            bw.write("Name:");
            bw.write("Narasimha");
            System.out.println("File write successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
