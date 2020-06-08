package Collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(10);
        System.out.println(list2);
        list2.set(2,2000);
        System.out.println(list2);              // set the list
        list2.add(3,5000);
        System.out.println(list2);

    }
}
