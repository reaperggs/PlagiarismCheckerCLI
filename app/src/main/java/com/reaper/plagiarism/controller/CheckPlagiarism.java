package com.reaper.plagiarism.controller;

import com.reaper.plagiarism.services.SimilarityCalculator;
import com.reaper.plagiarism.services.TextPreprocessor;
import com.reaper.plagiarism.services.FileReaderService;

public class CheckPlagiarism {
    public double checkPlagiarism(String str1, String str2){
        String text1 = String.valueOf(FileReaderService.readFile(str1));
        String text2 = String.valueOf(FileReaderService.readFile(str2));

        String processedText1 = TextPreprocessor.preprocess(text1);
        String processedText2 = TextPreprocessor.preprocess(text2);

        return SimilarityCalculator.calculateCosineSimilarity(processedText1,processedText2);
    }
}