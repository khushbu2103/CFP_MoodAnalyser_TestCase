package org.example;

public class MoodAnalyser {
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
