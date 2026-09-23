package Chapter1;

import java.util.Arrays;

public class Maxvalue {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 9, 10};
        System.out.print(max(arr));
    }

    //imagine that array is not empty
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        } return maxVal;
    }
}
