package Collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(Integer.valueOf(90));  // primitive object type;
        li.add(190);
        li.add(Integer.valueOf(190));
        li.add(900);
        System.out.println(li);
        li.remove(1);
        System.out.println(li);
    }
}
