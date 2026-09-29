package LinearSearch;
//Find number of nos that have even no of digits;
public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findnumers(nums));

        //if you want to count digits by giving your own input then ;
        System.out.println(digits(-54637));

    }

    static int findnumers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }


    // Function to check whether a number contains even digits or not;
    static boolean even(int num) {
        int NumberofDigits = digits(num);
        if (NumberofDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    //count no of digits in a number;
    static int digits(int num) {

        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10; // or num /= 10
        }
        return count;
    }
}

