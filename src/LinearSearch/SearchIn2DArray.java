package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {11,22,33},
                {44,55,66,77},
                {88,99,111,222},
                {333,444}
        };

        int target = 111;
        int[] ans = search(arr,target); //format of return value {row,col};
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target){
                    return new int[]{row,col};
                    //new int issliye kyuki humne array banate time usko initialize nhi kiya tha
                    // int [][]arr = new int [][] krte toh iski return me zarurat nhi hoti;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
