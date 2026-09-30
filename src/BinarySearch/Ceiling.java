package BinarySearch;

public class Ceiling {
    public static void main(String[] args){

        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }


// ceiling = Smallest number greater than equal to the Target ;
    static int Ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;
            //might be possible (start + end)exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return mid;
            }
        }
        return start;
    }
}
