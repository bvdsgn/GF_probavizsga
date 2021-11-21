package com.gfa.trialexam.solution;

import java.util.Arrays;

public class ThreeSum {
    public static void threeSum(){

        int array[] = {100, 450, 200, 5};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[0] + array[1] + array[2];
        System.out.println("2nd smallest element is ::"+res);
    }
    public static void main(String[] args) {
        threeSum();
    }
}
