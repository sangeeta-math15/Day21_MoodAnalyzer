package com.bridgelabz.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    @Test
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am In a Sad Mood");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void given_HappyMood_Should_Return_Happy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
        String mood=moodAnalyzer.analyseMood("Iam in any Mood");
        Assert.assertEquals("HAPPY",mood);
    }
}


