package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_Mood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("Iam in Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_AnyMood_Should_Return_Happy(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}


