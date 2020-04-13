package io.runner;

public class Stack {
    static int []stack=new int[5];
    static int top=0;
    public static void main(String args[]) {
        pusp(4);
        pusp(9);
        pusp(12);
        pusp(22);
        System.out.println("the size is"+size());
      System.out.println( "the pop element is:"+ pop());
        System.out.println("the size is"+size());
        show();


    }


    public static void pusp(int data) {
        stack[top]=data;
        top++;

    }
    public static int pop(){
        int data;
        top--;
        data=stack[top];
        stack[top]=0;

        return data;
    }
    public static int size(){
        return top;
    }
    public static void show(){
        for(int i:stack)
        {
            System.out.println(i+" ");
        }
    }
}
