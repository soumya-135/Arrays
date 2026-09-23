package Chapter1;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        //you specified 10 but you can add as many as you want...
        list.add(67);
        list.add(975);
        list.add(777777);
        list.add(77777);
        list.add(7777);
        list.add(777);
        list.add(77);
        list.add(7);
        System.out.println(list);

        //to check any element that the list contains...
        System.out.println(list.contains(777));
        System.out.println(list.contains(676));

        //if i want to change index like zeroth index to 7
        list.set(0,99);
        System.out.println(list);

        //to remove any index
        list.remove(2);
        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list); // usko continue connect horha ye , means we can add more by user

        //get any item from list at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }


    }
}
