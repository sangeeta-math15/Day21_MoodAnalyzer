package com.bridgelabz.moodanalyzer;


public class MoodAnalysisException extends Throwable {
    public MoodAnalysisException(String message, Exception_Type type) {
        super(message);
    }
    public enum Exception_Type {
        NULL, EMPTY;
    }
}
