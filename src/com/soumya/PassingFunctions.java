package com.soumya;

import java.util.Arrays;

public class PassingFunctions {
    static void main() {
        int[] num = {1,3,5,6,9};
        System.out.println(Arrays.toString(num));

        change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
