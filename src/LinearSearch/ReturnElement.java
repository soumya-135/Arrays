package LinearSearch;

public class ReturnElement {
    public static void main(String[] args) {

        int[] nums = {11, 34, 87, 98, 55, -3, -67, 36};
        int target = 36;

        //print the answer by calling the function
        int ans = linearSearch2(nums,target);
        System.out.println(ans);


    }
    //search the target and return the element;
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop;
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // This line will execute if none of the return statements above have executed
        // Hence the target not found;
        return -1;
    }
}

