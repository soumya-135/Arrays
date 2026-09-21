import java.util.Arrays;

public class Main {
    static void main(String[] args) {


            int[] arr = new int[5];
            arr[0] = 210;
            arr[1] = 218;
            arr[2] = 216;
            arr[3] = 214;
            arr[4] = 221;
        System.out.println(arr[3]);
        for (int[] a : new int[][]{arr}) {
            System.out.println(Arrays.toString(a));
        }
    }
}
