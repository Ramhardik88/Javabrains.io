package DataStructure.Queue;


class CQueue{
    private int rear;
    private int front;
    private int arr[];
    private  int itemCount;

    public CQueue() {
        rear=-1;
        front=-1;
        arr=new int[5];
        itemCount=0;
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
        if((rear+1)%5==front)
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
            rear=(rear+1)%5;
            arr[rear]=value;
        }
        itemCount++;

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
            itemCount--;

            return x;
        }
        else
        {
            x=arr[front];
            arr[front]=0;
            front=(front+1)%5;
            itemCount--;
            return x;
        }

    }
    public int count()
    {
        return itemCount;
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

public class  CircularQueue
{
    public static void main(String[] args) {
       CQueue cq= new CQueue();
        System.out.println(cq.isEmpty());

        cq.enQueue(43);
        cq.enQueue(34);
        cq.enQueue(12);
        cq.enQueue(122);
        cq.enQueue(10);
        cq.display();
        System.out.println("the remove element is "+cq.deQueue());

        cq.enQueue(30);

        cq.deQueue();
        cq.display();

        System.out.println(cq.count());


    }
}
    