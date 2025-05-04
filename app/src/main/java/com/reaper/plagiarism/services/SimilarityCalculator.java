package com.reaper.plagiarism.services;
import java.util.Map;

public class SimilarityCalculator {
    public static double calculateCosineSimilarity(String s1, String s2) {
        Map<String,Integer> vector1 = getWordCount(s1);
        Map<String,Integer> vector2 = getWordCount(s2);
        // Calculate the dot product
        double dotProduct = 0.0;
        for (String key : vector1.keySet()) {
            if (vector2.containsKey(key)) {
                dotProduct += vector1.get(key) * vector2.get(key);
            }
        }

        // Calculate the magnitude of the first vector
        double magnitude1 = 0.0;
        for (int value : vector1.values()) {
            magnitude1 += Math.pow(value, 2);
        }
        magnitude1 = Math.sqrt(magnitude1);

        // Calculate the magnitude of the second vector
        double magnitude2 = 0.0;
        for (int value : vector2.values()) {
            magnitude2 += Math.pow(value, 2);
        }
        magnitude2 = Math.sqrt(magnitude2);

        // Avoid division by zero
        if (magnitude1 == 0 || magnitude2 == 0) {
            return 0.0;
        }

        // Return the cosine similarity
        return dotProduct / (magnitude1 * magnitude2);
    }

    private static Map<String, Integer> getWordCount(String str2) {
        Map<String, Integer> wordFrequencyMap = new java.util.HashMap<>();
        String[] words = str2.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        return wordFrequencyMap;
    }
}
