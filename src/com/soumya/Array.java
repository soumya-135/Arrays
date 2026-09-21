package com.soumya;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



            //array of primitives
            int[] arr = new int[5];
            arr[0] = 210;
            arr[1] = 218;
            arr[2] = 216;
            arr[3] = 214;
            arr[4] = 221;
        System.out.println(arr[4]);
        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr [i] = in.nextInt();
            System.out.println(arr[i]);
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        for (int num : arr) {//here num represents element of an Array
            // for every element in the array print the element
            System.out.print(num + " ");
            
        }
        //System.out.println(arr[5]);
        //index out of bound error
    }
}
