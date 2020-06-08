package Collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        List<Integer> li= new ArrayList<>();
        li.add(2);
        li.add(3);
        System.out.println(li);
        li.add(0,90);

        int i=10;
        if(li.size()<10)       // add the element over the size of list
        {
            i=li.size();
            li.add(i,900);
            System.out.println(li);
        }


        ArrayList<String> list=new ArrayList<>();
        list.add("ab");
        list.add("abc");
        list.add("cde");
        list.add("efg");
        System.out.println(list);
        ArrayList<String > list1=new ArrayList<>();
        list1.add("abc");
        list1.add("abfg");

        list.addAll(2,list1);
        System.out.println(list);


    }
}
