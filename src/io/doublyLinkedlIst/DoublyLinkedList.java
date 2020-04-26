package io.doublyLinkedlIst;

public class DoublyLinkedList
{
    int size=0;
    Node head=null;
    Node tail=null;
    public void insertAtstart(int data)
    {
        Node node=new Node(data);
        if(size==0)
        {
            head=node;
            tail=node;
        }
        else
        {
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }
    public void insertAtEnd(int data)
    {
        Node n=new Node(data);
        if(size==0)
        {
            head=n;
            tail=n;
        }
        else
        {
            tail.next=n;
            n.prev=tail;
            n=tail;
        }
        size++;
    }

    public void show()
    {
        Node node=head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);

    }
}
