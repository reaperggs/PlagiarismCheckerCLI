package com.reaper.plagiarism.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileReaderService {

    // Initialize a logger for the class
    private static final Logger LOGGER = Logger.getLogger(FileReaderService.class.getName());

    /**
     * Reads the content of a file and returns it as a String.
     *
     * @param filePath The path to the file.
     * @return An Optional containing the content of the file, or empty if an error occurs.
     */
    public static Optional<String> readFile(String filePath) {
        try {
            // Read file content into a String with UTF-8 encoding
            String content = Files.readString(Path.of(filePath), StandardCharsets.UTF_8);
            return Optional.of(content);
        } catch (IOException e) {
            // Log the exception and provide context
            LOGGER.log(Level.SEVERE, "Failed to read file: " + filePath, e);
            return Optional.empty();
        }
    }
}