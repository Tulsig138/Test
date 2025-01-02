package com.library.librarymangementsystem;

import java.io.*;

public class LibraryManager {
    private static final String FILE_PATH = "C:\\Users\\tulsi\\OneDrive\\Documents\\NetBeansProjects\\LibraryMangementSystem\\src\\main\\java\\com\\library\\librarymangementsystem\\resources\\books.txt";

    public void addBook(Book book) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(book.toString());
            writer.newLine();
            System.out.println("Book added successfully.");
        } catch (IOException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    public void viewBooks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("Books in the library:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading books: " + e.getMessage());
        }
    }

    public void removeBook(String isbn) {
        File inputFile = new File(FILE_PATH);
        File tempFile = new File("src/main/resources/temp_books.txt");

        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(isbn)) {
                    found = true;
                    continue;
                }
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error removing book: " + e.getMessage());
        }

        if (found) {
            if (inputFile.delete() && tempFile.renameTo(inputFile)) {
                System.out.println("Book removed successfully.");
            } else {
                System.out.println("Error updating the book file.");
            }
        } else {
            tempFile.delete();
            System.out.println("Book not found.");
        }
    }
}
