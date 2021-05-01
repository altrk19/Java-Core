package main;

import scanner.ClassScanner;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        new ClassScanner().getClassesWithGuava1("model");
        new ClassScanner().getClassesWithGuava2("model");
    }
}
