package LinearSearch;

public class ReturnTrueFalse {
    public static void main(String[] args) {

        int[] nums = {11, 34, 87, 98, 55, -3, -67, 36};
        int target = 11;

        //print the answer by calling the function
        boolean ans = linearSearch2(nums,target);
        System.out.println(ans);


    }
    //search the target and return the true or false;
     static boolean linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        //run a for loop;
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        // The target not found;
        return false;
    }
}


