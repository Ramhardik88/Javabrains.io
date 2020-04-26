package io.CircularLinkedList;

public class CircularlinkedList
{
    Node head;
    int size;

    public void insertAtend(int data)
    {
        Node node=new Node();
        node.next=null;
        node.data=data;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=head)
            {
                n=n.next;
            }
            n.next=node;
        }
        node.next=head;
        size++;
    }
    public void insertAtStart(int data)
    {
      Node node=new Node();
        node.data=data;
        node.next=null;
        node.next=head;
        head=node;
        size++;

    }
    public void insertAt(int data,int index)
    {
       Node node=new Node();
        node.data=data;
        node.next=null;
      if(index==0)
      {
          System.out.println("index out");
      }
        else
        {


        }
    }

    public void show()
    {
      Node node=head;
        while (node.next!=null)
        {
            System.out.println(node.data);
            node= node.next;

        }
        System.out.println(node.data);


    }

}
