package com.tecktricks.FileHandling;

import java.util.Scanner;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello , "+ name);
        if(name.isEmpty()){
            System.err.println("Error: Name is empty ,please try again ");
        }
    }
}
