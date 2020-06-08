package Collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);

        System.out.println(list);
        Integer removedData = list.remove(2);
        System.out.println(list);
        boolean removedData1 = list.remove(Integer.valueOf(20));
        System.out.println(list);
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(40);
        list1.add(10);
        list1.add(100);
        list.removeAll(list1);
        System.out.println(list);
        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(10);

      //  list2.removeIf(n ->(n>20));   // in java 8
        list2.removeIf(p ->(p%2==0));
        System.out.println(list2);
        List<Integer> list3=new ArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(10);
        System.out.println(list3);
        List<Integer> list4= new ArrayList<>();
        list4.add(10);
        list4.add(40);
        System.out.println(list3.retainAll(list4));
        System.out.println(list3);

    }
}

