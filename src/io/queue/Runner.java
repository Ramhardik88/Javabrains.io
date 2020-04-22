package io.queue;

public class Runner
{
    public static void main(String []args)
    {
        Circularqueue ciqueue=new Circularqueue();

        ciqueue.isEmpty();
        ciqueue.isFull();
        ciqueue.enQueue(43);
        ciqueue.enQueue(53);
        ciqueue.enQueue(41);
        ciqueue.enQueue(15);
        ciqueue.enQueue(31);
        ciqueue.deQueue();

        ciqueue.show();
        ciqueue.enQueue(91);
       System.out.println( ciqueue.isFull());
        ciqueue.show();

    }
}
