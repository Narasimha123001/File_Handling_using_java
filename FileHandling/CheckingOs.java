package com.tecktricks.FileHandling;

public class CheckingOs {
    public static void main(String[] args) {
        String OS = System.getProperty("os.name").toLowerCase();
        System.out.println("OS: " + OS);
    }
}

