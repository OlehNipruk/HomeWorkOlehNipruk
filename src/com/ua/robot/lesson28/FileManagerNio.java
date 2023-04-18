package com.ua.robot.lesson28;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManagerNio {

    public static void saveToFile(String data, String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            Files.write(filePath, data.getBytes());
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Path filePath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(filePath, Charset.defaultCharset());
            for (String line : lines) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from file: " + e.getMessage());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String data = "Hello, World!";
        String fileName = "example.txt";
        saveToFile(data, fileName);
        String retrievedData = readFromFile(fileName);
        System.out.println(retrievedData);
    }
}
