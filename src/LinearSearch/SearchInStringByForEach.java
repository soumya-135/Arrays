package LinearSearch;

import java.util.Arrays;

public class SearchInStringByForEach {public static void main(String[] args) {

    String name = "Soumya Mundharikar";
    char target = 'u';

    System.out.println(Arrays.toString(name.toCharArray()));
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


