package DataStructure.DoublyLinkedList;

public class Node {
    int key;
    int data;
    Node next;
    Node previous;

    public Node() {
        key=0;
        data=0;
        next=null;
        previous=null;
    }
    public Node(int k,int d)
    {
        key=k;
        data=d;
    }
}
