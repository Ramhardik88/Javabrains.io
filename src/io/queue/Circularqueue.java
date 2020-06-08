package io.queue;

public class Circularqueue
{
    int N=5;
    int cqueue[]=new int[N];
    int front=-1;
    int rear=-1;

    public boolean isEmpty()
    {
        if(front==-1 && rear==-1)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if((rear+1)%N==front)
            return true;
        return false;
    }
    public void enQueue(int data)
    {
        if(isFull())
           System.out.println("Queue is overflow");
        else if(isEmpty())
         rear=front=0;
        else
        { rear=(rear+1)%N;
        }
        cqueue[rear]=data;
    }
    public int  deQueue()
    {
        int x=0;
        if(isEmpty())
            System.out.println("DataStructure.DataStructure.Stack underflow error");
        else if(front==rear)
        {
            x=cqueue[front];
            rear=front=-1;
        }
        else
        {
            x=cqueue[front];
            front=(front+1)%4;
        }
         return x;
    }
    public void show()
    {
        for(int num:cqueue)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
