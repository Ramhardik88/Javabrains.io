package io.queue;

public class Queue
{
    int []queue=new int[5];
    int front=-1,rear=-1;

    public boolean isEmpty()
    {
        if(front==-1 && rear== -1)
            return true;
        return false;
    }
    public boolean isFull()
    {
        if(rear==queue.length-1)
            return true;
        return false;
    }
    public void enqueue(int data)
    {
        if(isFull())
            System.out.println("queue overflow error");
        else if(isEmpty())
            rear=front=0;
        else
            rear++;
        queue[rear]=data;
    }
    public int dequeue()
    {  int x = 0;
        if(isEmpty())
            System.out.println("Queue underflow");
        else if(rear==front)
        {
             x = queue[front];
             queue[front]=0;
             rear=front=-1;
        }
        else
        {
            x=queue[front];
            queue[front]=0;
            front++;
        }
        return x;
    }
    public void show()
    {
        for(int num:queue)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
