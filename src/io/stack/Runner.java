package io.stack;

public class Runner
{
    public static void main(String args[])
    {
        DStack stack=new DStack();
        stack.push(4);
        stack.show();
        stack.push(6);
        stack.show();

        stack.push(9);
        stack.show();
        stack.push(90);
        stack.show();
        stack.push(123);
        stack.show();
        stack.push(4567);
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();
        stack.pop();
        stack.show();



    }
}
