package io.singlyLinkedlist;

public class Runner
{
    public static void main(String args[])
    {
        SinglyLinkedList list= new SinglyLinkedList();
        list.insert(4);
        list.insert(6);
        list.insert(89);
        list.insertAtStart(25);

        list.deleteAt(2);
        list.show();

    }
}
