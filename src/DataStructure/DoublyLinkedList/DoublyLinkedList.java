package DataStructure.DoublyLinkedList;

public class DoublyLinkedList {

    Node head;

    public DoublyLinkedList() {
        head = null;
    }

    public DoublyLinkedList(Node n) {
        head = n;
    }

    //check if a node exists;
    Node checkIfNodeExists(int k) {
        Node temp = null;
        Node ptr = head;

        while (ptr != null) {
            if (ptr.key == k) {
                temp = ptr;
            }
            ptr = ptr.next;
        }
        return temp;
    }

    // node  apppend
    public void append(Node n) {
        if (checkIfNodeExists(n.key) != null) {
            System.out.println("node already exists with the key" + n.key + ". append another  node with differnt key value");
        } else {
            if (head == null) {
                head = n;
                System.out.println("node appended as head");
            } else {
                Node ptr = head;
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = n;
                n.previous = ptr;
                System.out.println("Node appended");

            }
        }
    }
    public void prepend(Node n)
    {
        if(checkIfNodeExists(n.key)!=null)
        {
            System.out.println("node already exists with the key" + n.key + ". append another  node with differnt key value");
        }
        else {
            if (head == null) {
                head = n;
                System.out.println("node prepended as head");
            }
            else
            {
                head.previous=n;
                n.next=head;
                head=n;
                System.out.println("node prepended");
            }
        }
    }

    public  void insertNodeAfter(int k,Node  n)
    {
        Node ptr=checkIfNodeExists(k);
        if(ptr==null)
        {
            System.out.println("No node  exists with key value :"+ k);
        }
        else
        {
            if(checkIfNodeExists(n.key)!=null)
            {
                System.out.println("node already exists with the key" + n.key + ". append another  node with differnt key value");
            }
            else {
                Node nodeNext=ptr.next;
                // insert at end
                if(nodeNext==null)
                {
                    ptr.next=n;
                    n.previous=ptr;
                    System.out.println("node insert at the end");
                }
                // insert at middle
                else
                    {
                        n.next=ptr.next;
                        nodeNext.previous=n;
                        n.previous=ptr;
                        ptr.next=n;
                        System.out.println("Node insert at the middle of the list");
                }
            }
        }
    }
    public void deleteByKey(int k)
    {
        Node ptr=checkIfNodeExists(k);
        if(ptr==null)
        {
            System.out.println("No node  exists with key value :"+ k);
        }
        else
        {
            if(head.key==k)
            {
                head=head.next;
                System.out.println("delete the first node");
            }
            else
            {
                Node nextNode= ptr.next;
                Node previousNode =ptr.previous;
                // deleting at the end
                if(nextNode==null)
                {
                    previousNode.next=null;
                    System.out.println("node deleted at the end");
                }
                // deleting in between
                else
                {
                    previousNode.next=nextNode;
                    nextNode.previous=previousNode;
                    System.out.println("Node deleted at the between");
                }
            }
        }
    }
    public  void update(int k,int d)
    {
        Node ptr= checkIfNodeExists(k);
        if(ptr!=null)
        {
            ptr.data=d;
            System.out.println(" data updated in  the list");
        }
        else
        {
            System.out.println("no node exist with the key : "+k);
        }
    }

    public void displayList()
    {
       if(head==null)
       {
           System.out.println("no node exists in doubly linked list");
       }
       else
       {
           Node temp=head;
           while (temp!=null)
           {
               System.out.println("key "+temp.key+","+" data "+temp.data);
               temp=temp.next;
           }
       }
    }

}
