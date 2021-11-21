package com.gfa.trialexam.solution;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GrammarCheck {
    public static void grammarCheck(){
        String text = "Alma hatalma agyamara. Haha";
        String textRegex = "[A-Z]";
        Pattern pattern = Pattern.compile(textRegex);
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();
        System.out.println(matches);
    }
    public static void main(String[] args) {
        grammarCheck();
    }
}
