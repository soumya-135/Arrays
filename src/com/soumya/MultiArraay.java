package com.soumya;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArraay {
    static void main(String[] args) {

        // a b c
        // e f g
        // h i j
        //int[][] arr = new int[3][];

        //or
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        System.out.println(arr.length); //it will print number of rows
        /*int[][] arr = {
                { 1, 2 , 3 };  //0th index
                { 4, 5 , 6};   //1st index
                { 7, 8 , 9 ;}  //2nd index-> arr2D[2] = {6,7,8,9}
        };*/
        for (int row = 0; row < arr.length; row++) {
            //for each column in row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
            
        }
    }
}
