package Collection.arraylist;

import java.util.ArrayList;

public class Example4 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("ab");
        list.add("abc");
        list.add("cde");
        list.add("efg");
        System.out.println(list);

        ArrayList<String> list1= (ArrayList<String>) list.clone();
        list1.remove(2);
        System.out.println(list1);

    }

}
