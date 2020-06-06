package DataStructure.Stack;
class Stack{
    private int top;
    private int arr[];
    int size=5;
    public Stack()
    {
        top=-1;

        arr=new int[size];
    }
    public Boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public Boolean isFull()
    {
        if(top==4)
            return true;
        else
            return false;
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack over flow");
        }
        else
        {
            top++;
            arr[top]=data;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack underFlow");
            return 0;
        }
        else
        {
            int popvalue=arr[top];
            arr[top]=0;
            top--;
            return   popvalue;
        }
    }
    public  int count()
    {
        return (top+1);
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack undeflow");
            return 0;
        }
        else
        {
            int data;
            data=arr[top-1];
            return data;

        }
    }
    public void change(int pos,int data)
    {
        arr[pos]=data ;
    }
    public void display()
    {
        for(int i=4;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}

public class Solution
{
    public static void main(String[] args) {
        Stack stack= new Stack();
        System.out.println(stack.isEmpty());
        stack.push(34);
        stack.push(32);
        stack.push(12);
        stack.display();
        System.out.println(stack.isFull());
        System.out.println(stack.pop());
        stack.push(40);
        stack.change(2,70);
        stack.display();

    }
}
