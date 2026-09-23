package LinearSearch;

import java.util.Arrays;

public class SearchInStringByForEach {public static void main(String[] args) {

    String name = "Soumya Mundharikar";
    char target = 'u';

    //name.toCharArray bass String ko Array me convert krega and Yaha hum usko
    //print kr rhe hai;
    System.out.println(Arrays.toString(name.toCharArray()));//this is for Str=array conversion and print
    //we dont need function for this just make a string and sout lagao
    //automatically it will print the string in Array format;

    //Yha I'm calling search 2 function so that
    // our search 2 can print T/F for the target
    System.out.println(search2(name,target));//only to print target result;
}
    static boolean search2(String str,char target){
        if (str.length() == 0){
            return false;
        }

        for (char ch: str.toCharArray()){
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}


