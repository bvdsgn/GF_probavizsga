package com.gfa.trialexam.solution;

public class AverageOfEveryNth {
    public static void averageOfEveryNth(){
        int n = 0;

        int [] numbers = {2, 4, 10, 34, 3, 16, 3, 21};
        for(int i = 0; i < numbers.length; i++){
            if(i%3 == 0){
                n += numbers[i];
            }
        }

        System.out.println(1 * n);
    }
    public static void main(String[] args) {
        averageOfEveryNth();
    }
}