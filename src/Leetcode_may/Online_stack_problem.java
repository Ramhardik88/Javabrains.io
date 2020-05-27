package Leetcode_may;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Online_stack_problem {

   Stack<Integer>  StackPrices;
   Stack<Integer> Stackspan;


    public Online_stack_problem() {
        StackPrices= new Stack<>();
        Stackspan= new Stack<>();

    }

    public int next(int price)
    {
        int count=1;
        while(!StackPrices.isEmpty() && StackPrices.peek()<=price)
        {
            StackPrices.pop();
            count+=Stackspan.pop();
        }

        StackPrices.push(price);
        Stackspan.push(count);

        return count;
    }

    public static void main(String[] args) {
        Online_stack_problem s= new Online_stack_problem();
        System.out.println( s.next(100));
        System.out.println(s.next(80));
        System.out.println( s.next(60));
        System.out.println(s.next(70));
        System.out.println( s.next(60));
        System.out.println(s.next(75));
        System.out.println( s.next(85));



    }
}
