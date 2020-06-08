package Collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2
{
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");
        list.add("test5");

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println(list);
        System.out.println("");
        System.out.println("Iterate list throungh loop");
        for (String i:list)
        {
            System.out.println(i);
        }
        System.out.println("uisng iterator");
        Iterator<String> it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
