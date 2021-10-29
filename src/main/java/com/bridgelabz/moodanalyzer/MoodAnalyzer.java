package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {
    public MoodAnalyzer() {
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
