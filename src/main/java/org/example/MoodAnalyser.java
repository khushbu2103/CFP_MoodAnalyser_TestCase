package org.example;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String  analyser(String msg)
    {
        if(msg.equals("i am in happy mood"))
        {
            System.out.println("happy");
            return "happy";
        }
        else if(msg.equals("i am in sad mood"))
        {
            System.out.println("sad");
            return "sad";
        }
        else
            return "Invalid message";
    }
}
