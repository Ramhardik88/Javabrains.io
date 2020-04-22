package io.stack;

public class DStack
{
    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(size()==capacity)
            expand();
        else {
            stack[top] = data;
            top++;
        }
    }

    private void expand() {
        int length=size();
        int newstack[]=new int[capacity*2];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;
        capacity*=2;

    }

    public int size()
    {
        return top;

    }
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }
    public int pop()
    {

        int data = 0;
        if(isEmpty()){
            System.out.println("stack underflow");
        }
        else{
            top--;
            data=stack[top];
            stack[top]=0;
            shrink();

        }
        return data;
    }

    private void shrink() {
        int length=size();
        if(length<=(capacity/2)/2)
        capacity=capacity/2;
        int newstack[]=new int[capacity];
        System.arraycopy(stack,0,newstack,0,length);
        stack=newstack;


    }

    public boolean isEmpty(){

        return top<=0;

    }
    public boolean isFull(){

        return top==5;

    }
    public  void show()
    {
        for(int num:stack)
        {
            System.out.print(num+" ");
        }
        System.out.println();

    }
}
