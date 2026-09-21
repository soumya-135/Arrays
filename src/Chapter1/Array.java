package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        //int[] rollno = {12,34,45,67,89};
        //System.out.println(rollno[0]);

        //array of objects
        String[] str = new String[4];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i <  str.length; i++)
            str[i] = in.next();
        System.out.println(Arrays.toString(str));
    }
}
