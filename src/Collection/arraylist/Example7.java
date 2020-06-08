package Collection.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example7
{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        list.add(50);
        list.add(60);
        list.add(70);
        Object[] list2 = list.toArray();
        System.out.println(list2[0]);
        System.out.println(list2[1]);
        System.out.println(list2[3]);
        System.out.println(list2[5]);
        System.out.println(Arrays.toString(list2));
    }
}
