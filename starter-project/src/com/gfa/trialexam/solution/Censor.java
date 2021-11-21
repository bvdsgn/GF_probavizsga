package com.gfa.trialexam.solution;

public class Censor {
    public static void censor() {
        String text = "A kedvenc gyümölcsöm a(z) alma";
        String new_text = text.replace("alma", "banán");
        System.out.println(new_text);
    }
    public static void main(String[] args) {
     censor();
    }
}
