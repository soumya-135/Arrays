package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class InputArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {225,25,233,566,788,76};

        System.out.println(arr[3]);
        //System.out.println(arr[5]); index out of bound error.

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();


        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();


        }
        //another method
        //for every element in the array , print the element
        for (int num: arr){
            System.out.print(num + " ");
            //here num represents element of array
        }
    }
}
