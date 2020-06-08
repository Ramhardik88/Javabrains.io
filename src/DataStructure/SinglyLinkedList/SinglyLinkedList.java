package DataStructure.SinglyLinkedList;

public class SinglyLinkedList
{
    Node head;
    SinglyLinkedList()
    {
        head=null;
    }
    SinglyLinkedList(Node n)
    {
       head=n;
    }

    Node nodeExists(int k)
    {
        Node temp= null;
        Node ptr=head;
        while (ptr!=null)
        {
            if(ptr.key==k)
            {
                temp=ptr;
            }
            ptr=ptr.next;
        }
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
                System.out.println(" node append as the head ");
            }
            else
            {
                Node temp=head;
                while (temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=n;
                System.out.println("node appended");
            }
        }
    }

    public void prepended(Node n)
    {
        if(nodeExists(n.key)!=null)
        {
            System.out.println("node already exists with the key"+n.key+". append another  node with differnt key value");
        }
        else
        {
            n.next=head;
            head=n;
            System.out.println("node prepended");
        }
    }
    public void insertNodeAfter(int k,Node n)
    {
        Node ptr=nodeExists(k);
        if(ptr==null)
        {
            System.out.println("no node exists with key value  "+ k);
        }
        else {
            if(nodeExists(n.key)!=null)
                {
                    System.out.println("node already exists with the key"+n.key+". append another  node with differnt key value");
                }
                else
                {
                    n.next=ptr.next;
                    ptr.next=n;
                }
        }
    }

    public void deleteBykey(int k)
    {
        if(head==null)
        {
            System.out.println("Singly linkedlist is already empty. can't delete");
        }
        else if(head!=null)
        {
            if(head.key==k)
            {
                head=head.next;
                System.out.println("Node unlinked with key values");
            }
            else
            {
                Node temp=null;
                Node prevptr=head;
                Node CurrentPtr=head.next;

                while (CurrentPtr!=null)
                {
                    if(CurrentPtr.key==k)
                    {
                        temp=CurrentPtr;       // match found
                        CurrentPtr=null;
                    }
                    else
                    {
                        prevptr=prevptr.next;
                        CurrentPtr=CurrentPtr.next;
                    }
                }
                if(temp!=null)
                {
                    prevptr.next=temp.next;
                    System.out.println("Node unlinked with key values :"+ k);
                }
                else
                {
                    System.out.println("Node does n't exists with Key values: "+ k);
                }
            }
        }

    }
    public void updateByKey(int k,int d)
    {
      Node ptr  =nodeExists(k);
      if(ptr!=null)
      {
          ptr.data=d;
          System.out.println("Node data updated succussfully");
      }
      else
      {
          System.out.println("Node doesn't exists with keyvalue");
      }
    }
    public void printlist()
    {
        if(head==null)
        {
            System.out.println("No Node in singlyLinkedList");
        }
        else {
            System.out.println("Singly linked list values are : ");
            Node temp=head;
            while (temp!=null)
            {
                System.out.println("key : " + temp.key +" data : "+temp.data);
                temp=temp.next;
            }
        }
    }

}
