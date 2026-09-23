package Chapter1;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main() {

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        //calling that function noww
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
