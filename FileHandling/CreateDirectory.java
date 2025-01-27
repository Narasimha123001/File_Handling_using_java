package com.tecktricks.FileHandling;

import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("src/com/tecktricks/folder");
        if(file.mkdirs()){
            System.out.println("Folder created");
        }else{
            System.out.println("Folder exists");
        }
    }
}
