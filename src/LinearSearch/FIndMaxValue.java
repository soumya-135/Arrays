package LinearSearch;

public class FIndMaxValue {
    public static void main(String[] args) {

        int[] nums = {11, 34, 87, 98, 55, -3, -67, 36};
        System.out.println(Max(nums));
    }
    //assume nums.length != 0 ;
    //Return the Maximum value in the array ;
    static int Max(int[] nums){
        int ans = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;
    }
}

