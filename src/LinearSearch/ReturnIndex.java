package LinearSearch;

public class ReturnIndex {
    public static void main(String[] args) {

        int[] nums = {11, 34, 87, 98, 55, -3, -67, 36};
        int target = 36;

        //print the answer by calling the function
        int ans = linearSearch(nums,target);
        System.out.println(ans);


    }
    //search in the array ; return the index if item found;
    //otherwise if item not found return -1;
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop;
        for (int index = 0; index < arr.length ; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        // This line will execute if none of the return statements above have executed
        // Hence the target not found;
        return -1;
    }
}
