package com.tecktricks.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/tecktricks/Create.txt");
        file.createNewFile();
        System.out.println("File created");
    }
}
