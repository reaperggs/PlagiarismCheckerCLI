package com.reaper.plagiarism.services;


public class TextPreprocessor {
    public static String preprocess(String text1) {
        text1 = text1.toLowerCase();
        text1 = text1.replaceAll("[^a-zA-Z\\s]", "");
        return text1;
    }
}
