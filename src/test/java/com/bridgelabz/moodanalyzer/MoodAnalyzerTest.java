package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_Mood_Should_Return_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("Iam in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}


