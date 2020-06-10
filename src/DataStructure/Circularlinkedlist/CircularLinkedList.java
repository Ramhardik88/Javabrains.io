package DataStructure.Circularlinkedlist;

public class CircularLinkedList {
    Node head;

    public CircularLinkedList() {
        head = null;
    }

    Node nodeExists(int k) {
        Node temp=null;
        Node ptr= head;

        if(ptr==null)
        {
            return temp;
        }
        else
        do{
            if(ptr.key==k)
            {
                temp=ptr;
            }
            ptr=ptr.next;
        }while (ptr!=head);

        return temp;

    }
    public void appendNode(Node n)
    {
        if(nodeExists(n.key)!=null)
        {
            System.out.println("node already exists with the key"+n.key+". append another  node with differnt key value");
        }
        else
        {
            if(head==null)
            {
                head=n;
                n.next=head;
                System.out.println("Node appended at the first position");
            }
            else {
                Node ptr=head;

                while (ptr.next!=head)
                {
                    ptr=ptr.next;
                }
                ptr.next=n;
                n.next=head;
                System.out.println("Node appended");

            }

        }
    }
    public void prepandNode(Node n)
    {
        if(nodeExists(n.key)!=null)
        {
            System.out.println("node already exists with the key"+n.key+". append another  node with differnt key value");
        }
        else
        {
            if(head==null)
            {
                head=n;
                n.next=head;
                System.out.println("Node prepended at the first position");
            }
            else
            {
                Node ptr= head;
                while (ptr.next!=head)
                {
                    ptr=ptr.next;
                }
                ptr.next=n;
                n.next=head;
                head=n;
                System.out.println("Node prepended");

            }

        }

    }
    public void insertAfter(int k,Node n)
    {
        Node ptr=nodeExists(k);
        if(ptr==null)
        {
            System.out.println("No node exists with the key value of k: "+k);
        }
        else
        {
            if(nodeExists(n.key)!=null)
            {
                System.out.println("node already exists with the key"+n.key+". append another  node with differnt key value");
            }
            else {
                if(ptr.next==head)
                {
                    n.next=head;
                    ptr.next=n;
                    System.out.println("Node insert at the end");
                }
                else
                {
                    n.next=ptr.next;
                    ptr.next=n;
                    System.out.println("Node insert at between");

                }
            }
        }

    }
    public void deleteByKey()
    {

    }

}
