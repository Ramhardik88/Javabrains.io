package io.stack;

public class Stack
{
    int stack[]=new int[5];
    int top=0;
    public void push(int data)
    {
        if(top==5){
            System.out.println("DataStructure.DataStructure.Stack is full");
        }
        else {


            stack[top] = data;
            top++;
        }

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
            
        }
        return data;
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
