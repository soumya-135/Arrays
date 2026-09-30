package BinarySearch;

public class FirstBinary {
    public static void main(String[] args){

        int[] arr = { -18 , -12 , -6 , 2 , 3 , 4 , 15 , 16 , 18 , 22 , 45 };
        int target = 22;
        int ans = binarysearch(arr,target);
        System.out.println(ans);
    }



    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;
            //might be possible (start + end)exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
