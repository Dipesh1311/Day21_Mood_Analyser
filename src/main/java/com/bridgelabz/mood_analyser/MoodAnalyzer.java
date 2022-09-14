package com.bridgelabz.mood_analyser;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {

    }

    public MoodAnalyzer(String message){
        this.message = message;
    }

    public String analyzeMood() {

        if(this.message.contains("Sad")) {
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
