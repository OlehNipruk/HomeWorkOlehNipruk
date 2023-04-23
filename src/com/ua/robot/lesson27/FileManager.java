package com.ua.robot.lesson27;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void saveToFile(String data, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving to file: " + e.getMessage());
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                line = reader.readLine();
                if (line != null) {
                    stringBuilder.append("\n");
                }
            }
            reader.close();
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

