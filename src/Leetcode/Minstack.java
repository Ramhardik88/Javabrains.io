package Leetcode;

import java.util.Stack;

public class Minstack {
    static Stack<Integer>stack=new Stack<>();
    static Stack<Integer>minstack=new Stack<>();

    public static void push(int x){
        int min=x;
        if(!minstack.isEmpty()&& min>minstack.peek()){
            min=minstack.peek();
        }
        stack.push(x);
        minstack.push(min);

    }
    public static void pop()
    {
        minstack.pop();
        stack.pop();
    }
    public static int top(){
        return stack.peek();
    }
    public static int getmin(){
        return  minstack.peek();
    }
    public static void show(){
        for(int i:stack){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String []args)
    {
        push(4);
        pop();
        push(5);

        push(9);
        push(10);
        push(50);

        show();

       System.out.println( "the min element is :"+getmin());
       System.out.println( "top of the stack"+top());


    }
}
