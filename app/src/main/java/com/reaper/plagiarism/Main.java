package com.reaper.plagiarism;
import com.reaper.plagiarism.controller.CheckPlagiarism;
public class Main {
    public static void main(String[] args) {
        CheckPlagiarism checker = new CheckPlagiarism();
        double similarity = checker.checkPlagiarism("file1.txt", "file2.txt");
        similarity = similarity * 100; // Convert to percentage
        similarity = Math.round(similarity * 100.0) / 100.0;
        System.out.println("Similarity: " + similarity + "%");
    }
}
