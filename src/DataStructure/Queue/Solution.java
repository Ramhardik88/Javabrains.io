package DataStructure.Queue;
class Queue{
    private int rear;
    private int front;
    private int arr[];

    public Queue() {
        rear=-1;
        front=-1;
        arr=new int[5];
    }

    public boolean isEmpty()
    {
        if(rear==-1 && front==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isFull()
    {
        if(rear==4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void enQueue(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        else if(isEmpty())
        {
            rear=front=0;
            arr[rear]=value;
        }
        else
        {
            rear++;
            arr[rear]=value;
        }

    }
    public int deQueue()
    {
        int x;
        if(isEmpty())
        {
            System.out.println(" queue is empty");
            return 0;
        }
        else if(front==rear)
        {
            x=arr[rear];
            arr[rear]=0;
            front=rear=-1;

            return x;
        }
        else
        {
          x=arr[front];
          arr[front]=0;
          front++;
          return x;
        }
    }
    public int count()
    {
        return rear-front+1;
    }
    public void display()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

public class Solution
{
    public static void main(String[] args) {
        Queue queue= new Queue();
        System.out.println(queue.isEmpty());

        queue.enQueue(43);
        queue.enQueue(34);
        queue.enQueue(12);
        queue.display();
        System.out.println("the remove element is "+queue.deQueue());
        queue.display();
        System.out.println(queue.count());


    }
}
