package LinearSearch;

public class FIndMin {
    public static void main(String[] args) {

        int[] nums = {11, 34, 87, 98, 55, -3, -67, 36};
        System.out.println(min(nums));
    }
    //assume nums.length != 0 ;
    //Return the minimum value in the array ;
    static int min(int[] nums){
        int ans = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] < ans){
                ans = nums[i];
            }
        }
        return ans;
    }
}
