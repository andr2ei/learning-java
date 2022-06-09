package ru.andronov.tutorials.level3.module3;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) {
        File fileToRead = new File("src/main/resources/test_file");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileToRead)))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println("reader.readLine() = " + reader.readLine());
                line = reader.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        File fileToWrite = new File("src/main/resources/test_file2");
        if (!fileToWrite.exists()) {
            System.out.println("Writing to file");
            try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileToWrite)))) {
                writer.write("Hi there!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        File fileToWrite2 = new File("src/main/resources/test_file3");
        if (!fileToWrite.exists()) {
            System.out.println("Writing to file 2");
            try (PrintWriter writer = new PrintWriter(fileToWrite2)) {
                writer.write("Hi there!");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
